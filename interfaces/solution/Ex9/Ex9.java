package interfaces.solution.Ex9;

//: interfaces/music5/Music5.java
//Interfaces.
import polymorphism.music.Note;
import static net.mindview.util.Print.*;

abstract class  Instrument {
	// Compile-time constant:
	private int i ;
	// Cannot have method definitions:

	abstract void play(Note n); // Automatically public

	abstract void adjust();
	public String toString(){
		return "Instrument";
	}
	
}

class Wind extends Instrument{
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Percussion extends Instrument {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Percussion";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Stringed extends Instrument {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	public String toString() {
		return "Woodwind";
	}
}

public class Ex9 {
	// Doesn't care about type, so new types
	// added to the system still work right:
	static void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument[] e) {
		for (Instrument i : e)
			tune(i);
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}
} /*
	 * Output: Wind.play() MIDDLE_C Percussion.play() MIDDLE_C Stringed.play()
	 * MIDDLE_C Brass.play() MIDDLE_C Woodwind.play() MIDDLE_C
	 */// :~
