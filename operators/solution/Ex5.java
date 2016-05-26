package operators.solution;

class Dog {
	String name;
	String says;
}
public class Ex5 {
	public static void main(String[] args){
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		dog1.name = "spot";
		dog1.says = "Ruff!";
		dog2.name = "scruffy";
		dog2.says = "Wurf!";
		Dog dog3 = new Dog();
		dog3.name = "spot";
		dog3.says = "Ruff!";
		System.out.println(dog1 == dog2);
		System.out.println(dog1 == dog3);

		System.out.println(dog1.equals(dog2));
		System.out.println(dog1.equals(dog3));
	}
}
