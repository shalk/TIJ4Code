package reusing.solution;

//Inheritance syntax & properties.
import static net.mindview.util.Print.*;

class Cleanser1 {
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
		Cleanser1 x = new Cleanser1();
		x.dilute();
		x.apply();
		x.scrub();
		print(x);
	}
}

class Detergent1 {
	// Change a method:
	private String name;
	private Cleanser1 cleanser = new Cleanser1();

	public Detergent1(String name) {
		this.name = name;
	}

	public void append(String a) {
		cleanser.append(a);
	}

	public void dilute() {
		cleanser.dilute();
	}

	public void apply() {
		cleanser.apply();
	}

	public void scrub() {
		cleanser.append(" Detergent.scrub()");
		cleanser.scrub(); // Call base-class version
	}

	public void foam() {
		cleanser.append(" foam()");
	}

	public String toString() {
		return cleanser.toString();
	}

	// Test the new class:
	public static void main(String[] args) {
		Detergent1 x = new Detergent1("haha");
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class:");
		Cleanser1.main(args);
	}
}
public class Ex11{
	public static void main(String[] args){
		Detergent1.main(args);
	}
}