//: generics/coffee/Americano.java
package typeinfo.solution.ex16;
import typeinfo.factory.*;
public class Americano extends Coffee {
	public static class CoffeeFactory implements Factory<Americano> {
		@Override
		public Americano create() {
			return new Americano();
		}
	}
} ///:~
