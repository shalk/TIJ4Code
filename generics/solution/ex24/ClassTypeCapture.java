//: generics/ClassTypeCapture.java
package generics.solution.ex24; /* Added by Eclipse.py */

import java.util.HashMap;
import java.util.Map;
import static net.mindview.util.Print.*;

interface Factory<T> {
	T create();
}

class Building {}
class House extends Building {}

class BuildingFactory implements Factory<Building> {
	@Override
	public Building create() {
		return new Building();
	}
}

class HouseFactory implements Factory<Building> {
	@Override
	public House create() {
		return new House();
	}
}

public class ClassTypeCapture<T> {
  Class<T> kind;
  Map<String,Factory> map = new HashMap<>();
  
  public ClassTypeCapture(Class<T> kind) {
    this.kind = kind;
  }

  public ClassTypeCapture(Class<T> kind,Map<String,Factory> map) {
    this.kind = kind;
    this.map = map;
  }

  public boolean f(Object arg) {
    return kind.isInstance(arg);
  }	
  public void addType(String typename, Factory factory) {
	  map.put(typename, factory);
  }

  public Object createNew(String typename) throws InstantiationException, IllegalAccessException {
	  if(map.containsKey(typename)){
		  return map.get(typename).create();
	  }
	  System.out.println(String.format("typename %s not exist", typename));
	  return null;
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
    
    ctt3.addType("House", new HouseFactory());
    ctt3.addType("Building", new BuildingFactory());
    
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
