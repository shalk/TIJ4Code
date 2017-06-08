//: typeinfo/pets/Cat.java
package typeinfo.solution.ex15.pets;

public class Cat extends Pet {
	public static class Factory implements typeinfo.factory.Factory<Cat> {
		public Cat create() {
			return new Cat();
		}
	}
  public Cat(String name) { super(name); }
  public Cat() { super(); }
} ///:~
