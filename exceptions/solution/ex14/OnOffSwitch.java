//: exceptions/OnOffSwitch.java
package exceptions.solution.ex14; /* Added by Eclipse.py */
// Why use finally?

import exceptions.OnOffException1;
import exceptions.OnOffException2;
import exceptions.Switch;

public class OnOffSwitch {
  private static Switch sw = new Switch();
  public static void f()
  throws OnOffException1,OnOffException2 {
      throw new RuntimeException();
  }
  public static void main(String[] args) {
    try {
      sw.on();
      // Code that can throw exceptions...
      f();
      sw.off();
    } catch(OnOffException1 e) {
      System.out.println("OnOffException1");
      sw.off();
    } catch(OnOffException2 e) {
      System.out.println("OnOffException2");
      sw.off();
    }
  }
} /* Output:
on
off
*///:~
