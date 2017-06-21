//: typeinfo/pets/Pet.java
package generics.solution.ex40.typeinfo.pets;

public class Pet extends Individual {
  public Pet(String name) { super(name); }
  public Pet() { super(); }
  public void speek() {
	  System.out.println(this.getClass().getSimpleName() + " speak");
  }
} ///:~
