//: generics/coffee/Latte.java
package typeinfo.solution.ex16;

import typeinfo.factory.Factory;

public class Latte extends Coffee {
	public static class CoffeeFactory implements Factory<Latte> {
		@Override
		public Latte create() {
			return new Latte();
		}
	}
} ///:~
