package polymorphism.solution;
class Cycle {
	public String type(){
		return "Cycle";
	}
	public void wheels(){}
}
class Unicycle extends Cycle {
	public String type(){
		return "Unicycle";
	}
	@Override
	public void wheels(){
		System.out.println("1");
	}
	public void balance(){
		System.out.println("Unicycle balance");
	}
}
class Bicycle  extends Cycle {
	public String type(){
		return "Bicycle";
	}
	@Override
	public void wheels(){
		System.out.println("2");
	}
	public void balance(){
		System.out.println("Bicycle balance");
	}
}
class Tricycle extends Cycle {
	public String type(){
		return "Tricycle";
	}
	@Override
	public void wheels(){
		System.out.println("3");
	}
}
public class Ex1 {
	public static void ride(Cycle c){
		c.wheels();
	}
	
	public static void main(String[] args){
		Unicycle c1 = new Unicycle();
		Bicycle c2 = new Bicycle();
		Tricycle c3 = new Tricycle();
		ride(c1);
		ride(c2);
		ride(c3);
		Cycle[] c = new Cycle[]{
				new Unicycle(),
				new Bicycle(),
				new Tricycle(),
		};
//		c[0].balance();
//		c[1].balance();
//		c[2].balance();
		((Unicycle)c[0]).balance();
		((Bicycle)c[1]).balance();
//		((Tricycle)c[2]).balance();
	}
}

