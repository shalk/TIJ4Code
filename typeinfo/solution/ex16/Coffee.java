//: generics/coffee/Coffee.java
package typeinfo.solution.ex16;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import typeinfo.factory.*;
public class Coffee {
  private static long counter = 0;
  private final long id = counter++;
  public String toString() {
    return getClass().getSimpleName() + " " + id;
  }
  static List<Factory<? extends Coffee>>coffeeFactories = new ArrayList<Factory<? extends Coffee>>();
  static {
	  coffeeFactories.add(new Americano.CoffeeFactory());
	  coffeeFactories.add(new Breve.CoffeeFactory());
	  coffeeFactories.add(new Cappuccino.CoffeeFactory());
	  coffeeFactories.add(new Latte.CoffeeFactory());
	  coffeeFactories.add(new Mocha.CoffeeFactory());
  }
  public static Random random = new Random(47);
  public static Coffee randomCoffee() {
	  int n = random.nextInt(coffeeFactories.size());
	  return coffeeFactories.get(n).create();
  }
} ///:~
