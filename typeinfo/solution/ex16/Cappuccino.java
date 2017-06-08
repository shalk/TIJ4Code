//: generics/coffee/Cappuccino.java
package typeinfo.solution.ex16;

import typeinfo.factory.Factory;

public class Cappuccino extends Coffee {
	public static class CoffeeFactory implements Factory<Cappuccino> {
		@Override
		public Cappuccino create() {
			return new Cappuccino();
		}
	}
} ///:~
