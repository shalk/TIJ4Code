//: typeinfo/SweetShop.java
package typeinfo.solution.ex07; /* Added by Eclipse.py */
// Examination of the way the class loader works.
import static net.mindview.util.Print.*;

class Candy {
  static { print("Loading Candy"); }
}

class Gum {
  static { print("Loading Gum"); }
}

class Cookie {
  static { print("Loading Cookie"); }
}

public class SweetShop {
  public static void main(String[] args) {	
    print("inside main");
    if( args.length != 1){
    	System.out.println("Usage: java typeinfo.solution.ex07.SweetShop Candy|Gum|Cookie");
    	System.exit(1);
    }
    String packageName = "typeinfo.solution.ex07."; 
    String className = packageName + args[0];
    try {
    	Class.forName(className);
    } catch(ClassNotFoundException e) {
    	print("Count'nt find " + className);
    }
    print("After creating " + className);
  }
} /* Output:
inside main
Loading Candy
After creating Candy
Loading Gum
After Class.forName("Gum")
Loading Cookie
After creating Cookie
*///:~
