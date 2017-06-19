//: generics/ClassTypeCapture.java
package generics.solution.ex21; /* Added by Eclipse.py */

import java.util.HashMap;
import java.util.Map;
import static net.mindview.util.Print.*;

class Building {}
class House extends Building {}

public class ClassTypeCapture<T> {
  Class<T> kind;
  Map<String,Class<?>> map = new HashMap<>();
  
  public ClassTypeCapture(Class<T> kind) {
    this.kind = kind;
  }
  public boolean f(Object arg) {
    return kind.isInstance(arg);
  }	
  public void addType(String typename, Class<?> kind) {
	  map.put(typename, kind);
  }

  public Object createNew(String typename) throws InstantiationException, IllegalAccessException {
	 Class<?> c = map.get(typename);
	 if(c == null){
		 return null;
	 }
	 return c.newInstance();
	 
  }

  public static void main(String[] args) {
    ClassTypeCapture<Building> ctt1 =
      new ClassTypeCapture<Building>(Building.class);
    System.out.println(ctt1.f(new Building()));
    System.out.println(ctt1.f(new House()));
    ClassTypeCapture<House> ctt2 =
      new ClassTypeCapture<House>(House.class);
    System.out.println(ctt2.f(new Building()));
    System.out.println(ctt2.f(new House()));
    
    ClassTypeCapture<House> ctt3 = new ClassTypeCapture<>(House.class);
    ctt3.addType("House", House.class);
    ctt3.addType("Building", Building.class);
    System.out.println(ctt3.map);
    
    try {
    	House h1 = (House) ctt3.createNew("House");
		Building b1 = (Building) ctt3.createNew("Building");
		print(h1 instanceof House);
		print(h1 instanceof Building);
		print(b1 instanceof House);
		print(b1 instanceof Building);
	} catch (InstantiationException | IllegalAccessException e) {
		e.printStackTrace();
	}
  }
} /* Output:
true
true
false
true
*///:~
