package generics.solution.ex01;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;

interface Shape {
  void draw();
  void show();
}
class Circle implements Shape {
  public void draw() {
    System.out.println("draw");
  }
  public void show() {
    System.out.println("show");
  }
  void runCircle() {
    System.out.println("run circle");
  }
}
class DynamicProxyCircle implements InvocationHandler {
  private static Object proxied;
  DynamicProxyCircle(Object proxied) {
    this.proxied = proxied;
  }
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Exception{
    return method.invoke(proxied,args);
  }
}
public class DynamicProxyTest {
  public static void main(String[] args){
    Object proxy = Proxy.newProxyInstance(
    	Shape.class.getClassLoader(),
      	new Class[]{ Shape.class},
      	new DynamicProxyCircle(new Circle())
    	);
    Shape s = (Shape)proxy;
    s.draw();
    s.show();
    //s.runCircle();
  }
}