//: generics/GenericMethods.java
package generics.solution.ex10; /* Added by Eclipse.py */

public class GenericMethods {
  public <T,U> void f(T x, U y, String z) {
    System.out.print("x:"+x.getClass().getName());
    System.out.print(" y:" + y.getClass().getName());
    System.out.println(" z:" + z);
  }
  public static void main(String[] args) {
    GenericMethods gm = new GenericMethods();
    gm.f(1, 1.0, "aaa");
    gm.f(1.0f, 1.0, "gm");
    gm.f(true, false, "string true");

  }
} /* Output:
java.lang.String
java.lang.Integer
java.lang.Double
java.lang.Float
java.lang.Character
GenericMethods
*///:~
