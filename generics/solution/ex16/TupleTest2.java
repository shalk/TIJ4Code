//: generics/TupleTest2.java
package generics.solution.ex16; /* Added by Eclipse.py */
import net.mindview.util.*;
import static net.mindview.util.Tuple.*;

class Amphibian {}
class Vehicle {}

public class TupleTest2 {
	static <A,B,C,D,E,F> SixTuple<A,B,C,D,E,F> sixtuple(A a, B b, C c, D d, E e, F f){
		return new SixTuple<A,B,C,D,E,F>(a, b, c, d, e, f);
	}

  static TwoTuple<String,Integer> f() {
    return tuple("hi", 47);
  }
  static TwoTuple f2() { return tuple("hi", 47); }
  static ThreeTuple<Amphibian,String,Integer> g() {
    return tuple(new Amphibian(), "hi", 47);
  }
  static
  FourTuple<Vehicle,Amphibian,String,Integer> h() {
    return tuple(new Vehicle(), new Amphibian(), "hi", 47);
  }
  static
  FiveTuple<Vehicle,Amphibian,String,Integer,Double> k() {
    return tuple(new Vehicle(), new Amphibian(),
      "hi", 47, 11.1);
  }
  static 
  SixTuple<Vehicle,Amphibian,String,Integer,Double,Boolean> six() {
	  return sixtuple(new Vehicle(), new Amphibian(),
		      "hi", 47, 11.1,true);
  }

  public static void main(String[] args) {
    TwoTuple<String,Integer> ttsi = f();
    System.out.println(ttsi);
	@SuppressWarnings("unchecked")
	TwoTuple<String,Integer> f2value = f2();
	System.out.println(f2value);
    System.out.println(f2());
    System.out.println(g());
    System.out.println(h());
    System.out.println(k());
    System.out.println(six());
  }
} /* Output: (80% match)
(hi, 47)
(hi, 47)
(Amphibian@7d772e, hi, 47)
(Vehicle@757aef, Amphibian@d9f9c3, hi, 47)
(Vehicle@1a46e30, Amphibian@3e25a5, hi, 47, 11.1)
*///:~
