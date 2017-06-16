//: generics/Generators.java
package generics.solution.ex13; /* Added by Eclipse.py */
import generics.Fibonacci;
// A utility to use with Generators.
import generics.coffee.*;
import java.util.*;
import net.mindview.util.*;

public class Generators {
  public static <T> Collection<T>
  fill(Collection<T> coll, Generator<T> gen, int n) {
    for(int i = 0; i < n; i++)
      coll.add(gen.next());
    return coll;
  }	
  
  public static <T> List<T>
  fill(List<T> coll, Generator<T> gen, int n) {
	  System.out.println(coll.getClass().getName());
    for(int i = 0; i < n; i++)
      coll.add(gen.next());
    return coll;
  }	

  public static <T> List<T>
  fill(LinkedList<T> coll, Generator<T> gen, int n) {
	  System.out.println("Linked  "+coll.getClass().getName());
    for(int i = 0; i < n; i++)
      coll.add(gen.next());
    return coll;
  }	

  public static void main(String[] args) {
    Collection<Coffee> coffee = fill(
      new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
    for(Coffee c : coffee)
      System.out.println(c);
    Collection<Integer> fnumbers = fill(
      new LinkedList<Integer>(), new Fibonacci(), 12);
    for(int i : fnumbers)
      System.out.print(i + ", ");
  }
} /* Output:
Americano 0
Latte 1
Americano 2
Mocha 3
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
*///:~
