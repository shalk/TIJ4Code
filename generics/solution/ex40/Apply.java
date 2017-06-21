//: generics/Apply.java
package generics.solution.ex40; /* Added by Eclipse.py */
// {main: ApplyTest}
import java.lang.reflect.*;
import java.util.*;

import generics.SimpleQueue;
import generics.solution.ex40.typeinfo.pets.Cat;
import generics.solution.ex40.typeinfo.pets.Dog;
import generics.solution.ex40.typeinfo.pets.Pet;

import static net.mindview.util.Print.*;

public class Apply {
  public static <T, S extends Iterable<? extends T>>
  void apply(S seq, Method f, Object... args) {
    try {
      for(T t: seq)
        f.invoke(t, args);
    } catch(Exception e) {
      // Failures are programmer errors
      throw new RuntimeException(e);
    }
  }
  public static void main(String[] args) {
	  try {
		testApplyPet();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  public static void testApplyPet() throws NoSuchMethodException, SecurityException {
	  List<Pet> pets = new ArrayList<Pet>();
	  pets.add(new Dog());
	  pets.add(new Cat());
	  Apply.apply(pets, Pet.class.getMethod("speek"));
	  
	  FilledList<Pet> pets1 = new FilledList<>(Dog.class,10);
	  Apply.apply(pets1, Pet.class.getMethod("speek"));
	  
	  SimpleQueue<Pet> pets2 = new SimpleQueue<>();
	  pets2.add(new Cat());
	  pets2.add(new Cat());
	  Apply.apply(pets2, Pet.class.getMethod("speek"));
  }
}	

class Shape {
  public void rotate() { print(this + " rotate"); }
  public void resize(int newSize) {
    print(this + " resize " + newSize);
  }
}

class Square extends Shape {}

class FilledList<T> extends ArrayList<T> {
  public FilledList(Class<? extends T> type, int size) {
    try {
      for(int i = 0; i < size; i++)
        // Assumes default constructor:
        add(type.newInstance());
    } catch(Exception e) {
      throw new RuntimeException(e);
    }
  }
}	


class ApplyTest {
  public static void main(String[] args) throws Exception {
    List<Shape> shapes = new ArrayList<Shape>();
    for(int i = 0; i < 10; i++)
      shapes.add(new Shape());
    Apply.apply(shapes, Shape.class.getMethod("rotate"));
    Apply.apply(shapes,
      Shape.class.getMethod("resize", int.class), 5);
    List<Square> squares = new ArrayList<Square>();
    for(int i = 0; i < 10; i++)
      squares.add(new Square());
    Apply.apply(squares, Shape.class.getMethod("rotate"));
    Apply.apply(squares,
      Shape.class.getMethod("resize", int.class), 5);
	
    Apply.apply(new FilledList<Shape>(Shape.class, 10),
      Shape.class.getMethod("rotate"));
    Apply.apply(new FilledList<Shape>(Square.class, 10),
      Shape.class.getMethod("rotate"));

    SimpleQueue<Shape> shapeQ = new SimpleQueue<Shape>();
    for(int i = 0; i < 5; i++) {
      shapeQ.add(new Shape());
      shapeQ.add(new Square());
    }
    Apply.apply(shapeQ, Shape.class.getMethod("rotate"));
    
    
    
  }
} /* (Execute to see output) *///:~
