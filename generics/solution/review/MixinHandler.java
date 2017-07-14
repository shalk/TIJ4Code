package generics.solution.review;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

interface Foo1 {
  void method1();
}

interface Foo2 {
  void method2();
}
interface Foo3 {
  void method3();
}
class Foo1Imp implements Foo1 {
 public void method1() { System.out.println("Foo1Imp invoke method1()");} 
}

class Foo2Imp implements Foo2 {
 public void method2() { System.out.println("Foo2Imp invoke method2()");} 
}

class Foo3Imp implements Foo3 {
 public void method3() { System.out.println("Foo3Imp invoke method3()");} 
}
// –¥Œ“√«mixin
public class MixinHandler implements InvocationHandler {
  Map<String,Object> map = new HashMap<>();
  
  public MixinHandler(Map<Class,Object> map){
   	for (Class c: map.keySet()) {
      for (Method m: c.getMethods()) {
        this.map.put(m.getName(), map.get(c));
      }
   	}
  }
  
  public Object invoke(Object proxy, Method method, Object...args) throws Exception {
    if (map.containsKey(method.getName())){
      	Object proxied = map.get(method.getName());
    	return method.invoke(proxied,args);
    } else {
      	return null;
    }
  }
  public static void main(String[] args) {
    Map<Class,Object> map = new HashMap<>();
    map.put(Foo1Imp.class, new Foo1Imp());
    map.put(Foo2Imp.class, new Foo2Imp());
    map.put(Foo3Imp.class, new Foo3Imp());
    Object proxy = Proxy.newProxyInstance(MixinHandler.class.getClassLoader(),
                                         new Class[]{ Foo1.class, Foo2.class, Foo3.class},
                                          new MixinHandler(map)
                                         );
    Foo1 foo1 = (Foo1)proxy;
    foo1.method1();
  }
}