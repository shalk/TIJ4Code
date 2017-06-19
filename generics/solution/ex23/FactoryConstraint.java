//: generics/FactoryConstraint.java
package generics.solution.ex23; /* Added by Eclipse.py */
import static net.mindview.util.Print.*;
interface FactoryI<T> {
  T create(Object arg);
}

class Foo2<T> {
  private T x;
  public <F extends FactoryI<T>> Foo2(F factory, Object arg) {
    x = factory.create(arg);
    print(x);
  }
  // ...
}

class IntegerFactory implements FactoryI<Integer> {
  public Integer create(Object arg) {
	  if(arg instanceof Integer){
		  return new Integer((Integer) arg);
	  }
    return new Integer(0);
  }
}	

class Widget {
	public String name;
	public Widget(String name) {
		this.name = name;
	}
	public String toString() {
		return "Widge " + name;
	}
  public static class Factory implements FactoryI<Widget> {
    public Widget create(Object arg) {
    	if( arg instanceof String) {
    		return new Widget((String)arg);
    	}else{
    		throw new RuntimeException();
    	}
    }
  }
}

public class FactoryConstraint {
  public static void main(String[] args) {
    new Foo2<Integer>(new IntegerFactory(),10);
    new Foo2<Widget>(new Widget.Factory(),"nice");
  }
} ///:~
