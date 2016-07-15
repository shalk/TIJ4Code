package interfaces.solution.Ex8;

//Order of constructor calls.
import static net.mindview.util.Print.*;

class Meal {
	Meal() {
		print("Meal()");
	}
}

class Bread {
	Bread() {
		print("Bread()");
	}
}

class Cheese {
	Cheese() {
		print("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		print("Lettuce()");
	}
}

class Lunch extends Meal {
	Lunch() {
		print("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		print("PortableLunch()");
	}
}
interface FastFood {
	public void showFood();
	public void eatFood();
}
class Sandwich extends PortableLunch implements FastFood{
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();

	public Sandwich() {
		print("Sandwich()");
	}
	public void showFood(){
		print("Show Food:");
		print(b);
		print(c);
		print(l);
	}
	public void eatFood(){
		System.out.println("eat Bread ,cheese and lettuce");
	}
	
	public static void main(String[] args) {
		new Sandwich();
	}
} /*
	 * Output: Meal() Lunch() PortableLunch() Bread() Cheese() Lettuce()
	 * Sandwich()
	 */// :~

public class Ex8 {
	public static void main(String[] args) {
		Sandwich ob = new Sandwich();
		ob.showFood();
		ob.eatFood();
	}
}
