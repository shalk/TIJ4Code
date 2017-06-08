//: typeinfo/pets/Pet.java
package typeinfo.solution.ex15.pets;
public class Pet extends Individual {
	public static class Factory implements typeinfo.factory.Factory<Pet> {
		public Pet create() {
			return new Pet();
		}
	}
  public Pet(String name) { super(name); }
  public Pet() { super(); }
} ///:~
