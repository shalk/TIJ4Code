package reusing.solution;
//: reusing/Detergent.java

//Inheritance syntax & properties.
import static net.mindview.util.Print.*;

class Cleanser {
	private String s = "Cleanser";

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append(" scrub()");
	}

	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		print(x);
	}
}

class Detergent extends Cleanser {
	// Change a method:
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub(); // Call base-class version
	}

	// Add methods to the interface:
	public void foam() {
		append(" foam()");
	}

	// Test the new class:
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print(" Testing base class:");
		Cleanser.main(args);
	}
}
public class Ex2 extends Detergent{
	public void scrub(){
		append(" Ex2.scrub()");
		super.scrub();
	}
	public void sterilize(){
		append(" Ex2.sterilize()");
	}
	public static void main(String[] args){
		Ex2 ob = new Ex2();
		ob.apply();
		ob.dilute();
		ob.foam();
		ob.scrub();
		ob.sterilize();
		print(ob);
		System.out.println(" Testing base class:");
		Detergent.main(args);
	}
}
