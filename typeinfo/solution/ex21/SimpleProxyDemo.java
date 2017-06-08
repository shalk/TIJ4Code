//: typeinfo/SimpleProxyDemo.java
package typeinfo.solution.ex21; /* Added by Eclipse.py */
import static net.mindview.util.Print.*;

interface Interface {
  void doSomething();
  void somethingElse(String arg);
}

class RealObject implements Interface {
  public void doSomething() { print("doSomething"); }
  public void somethingElse(String arg) {
    print("somethingElse " + arg);
  }
}	

class SimpleProxy implements Interface {
  private Interface proxied;
  private static int count = 0;
  private static int count1 = 0;
  private static int count2 = 0;
  public SimpleProxy(Interface proxied) {
    this.proxied = proxied;
  }
  public void doSomething() {
	count1 = count1 + 1;
	count = count + 1;
    print("SimpleProxy[" + count + "] doSomething "  );
    proxied.doSomething();
  }
  public void somethingElse(String arg) {
	count2 = count2 + 1;
	count = count + 1;
    print("SimpleProxy[" + count + "] somethingElse " + arg);
    proxied.somethingElse(arg);
  }
}	

class SimpleProxyDemo {
  public static void consumer(Interface iface) {
    iface.doSomething();
    iface.somethingElse("bonobo");
  }
  public static void main(String[] args) {
//    consumer(new RealObject());
    consumer(new SimpleProxy(new RealObject()));
    consumer(new SimpleProxy(new RealObject()));
    consumer(new SimpleProxy(new RealObject()));
    consumer(new SimpleProxy(new RealObject()));
  }
} /* Output:
doSomething
somethingElse bonobo
SimpleProxy doSomething
doSomething
SimpleProxy somethingElse bonobo
somethingElse bonobo
*///:~
