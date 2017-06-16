//: generics/Holder3.java
package generics.solution.ex01; /* Added by Eclipse.py */
import typeinfo.pets.*;
public class Holder3<T> {
  private T a;
  public Holder3(T a) { this.a = a; }
  public void set(T a) { this.a = a; }
  public T get() { return a; }
  public static void main(String[] args) {
	  Holder3<Pet> h = new Holder3<Pet>(new Cat());
	  Pet c = h.get();
	  h.set(new Cat());
    // h3.set("Not an Automobile"); // Error
    // h3.set(1); // Error
  }
} ///:~
