//: generics/GenericMethods.java
package generics.solution.ex09; /* Added by Eclipse.py */

public class GenericMethods {
  public <T,U,V> void f(T x, U y, V z) {
    System.out.print("x:"+x.getClass().getName());
    System.out.print(" y:" + y.getClass().getName());
    System.out.println(" z:" + z.getClass().getName());
  }
  public static void main(String[] args) {
    GenericMethods gm = new GenericMethods();
    gm.f(1, 1.0, "aaa");
    gm.f(1.0f, 1.0, gm);
    gm.f(true, false, true);

  }
} /* Output:
java.lang.String
java.lang.Integer
java.lang.Double
java.lang.Float
java.lang.Character
GenericMethods
*///:~
