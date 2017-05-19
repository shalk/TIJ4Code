//: exceptions/WithFinally.java
package exceptions.solution.ex15; /* Added by Eclipse.py */
// Finally Guarantees cleanup.

import exceptions.OnOffException1;
import exceptions.OnOffException2;
import exceptions.OnOffSwitch;
import exceptions.Switch;

public class WithFinally {
  static Switch sw = new Switch();
  public static void main(String[] args) {
    try {
      sw.on();
      // Code that can throw exceptions...
      OnOffSwitch.f();
      throw new RuntimeException(); 
    } catch(OnOffException1 e) {
      System.out.println("OnOffException1");
    } catch(OnOffException2 e) {
      System.out.println("OnOffException2");
    } finally {
      sw.off();
    }
  }
} /* Output:
on
off
*///:~
