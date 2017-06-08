//: generics/coffee/Mocha.java
package typeinfo.solution.ex16;

import typeinfo.factory.Factory;

public class Mocha extends Coffee {
	public static class CoffeeFactory implements Factory<Mocha> {
		@Override
		public Mocha create() {
			return new Mocha();
		}
	}
} ///:~
