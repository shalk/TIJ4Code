//: generics/coffee/Breve.java
package typeinfo.solution.ex16;

import typeinfo.factory.Factory;

public class Breve extends Coffee {
	public static class CoffeeFactory implements Factory<Breve> {
		@Override
		public Breve create() {
			return new Breve();
		}
	}
} ///:~
