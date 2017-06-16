//: generics/BasicGeneratorDemo.java
package generics.solution.ex14; /* Added by Eclipse.py */
import generics.CountedObject;
import net.mindview.util.*;

public class BasicGeneratorDemo {
  public static void main(String[] args) {
    Generator<CountedObject> gen = new BasicGenerator<CountedObject>(CountedObject.class);
    for(int i = 0; i < 5; i++)
      System.out.println(gen.next());
  }
} /* Output:
CountedObject 0
CountedObject 1
CountedObject 2
CountedObject 3
CountedObject 4
*///:~
