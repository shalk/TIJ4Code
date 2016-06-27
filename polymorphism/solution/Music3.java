//: polymorphism/music3/Music3.java
// An extensible program.
package polymorphism.solution;

import polymorphism.music.Note;
import static net.mindview.util.Print.*;

import java.util.Random;

class Instrument {
	void play(Note n) {
		print("Instrument.play() " + n);
	}

	public String toString() {
		return "Instrument";
	}

	void adjust() {
		print("Adjusting Instrument");
	}
}

class Wind extends Instrument {
	void play(Note n) {
		print("Wind.play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	void adjust() {
		print("Adjusting Wind");
	}
}

class Percussion extends Instrument {
	void play(Note n) {
		print("Percussion.play() " + n);
	}

	public String toString() {
		return "Percussion";
	}

	void adjust() {
		print("Adjusting Percussion");
	}
}

class Stringed extends Instrument {
	void play(Note n) {
		print("Stringed.play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	void adjust() {
		print("Adjusting Stringed");
	}
}

class Brass extends Wind {
	void play(Note n) {
		print("Brass.play() " + n);
	}

	void adjust() {
		print("Adjusting Brass");
	}
	public String toString(){
		return "Brass";
	}
}

class Woodwind extends Wind {
	void play(Note n) {
		print("Woodwind.play() " + n);
	}

	public String toString() {
		return "Woodwind";
	}
}
class Guitar extends Instrument {
	void play(Note n) {
		print("Guitar.play() " + n);
	}
	public String toString() {
		return "Guitar";
	}
}
class RandomInstrumentGenerator {
	Random rand= new Random(47);
	Instrument next(){
		switch(rand.nextInt(6)){
		default :
		case 0: return new Wind();
		case 1: return new Percussion(); 
		case 2: return new Stringed();
		case 3: return new Brass();
		case 4: return new Woodwind();
		case 5: return new Guitar();
		}
	}
}
public class Music3 {
	// Doesn't care about type, so new types
	// added to the system still work right:
	public static void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument[] e) {
		for (Instrument i : e)
			tune(i);
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		final int tun_num = 10;
		Instrument[] orchestra = new Instrument[tun_num];
		RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
		for(int i = 0; i < tun_num ; i++ ){
			orchestra[i] = gen.next();
		}
//		Instrument[] orchestra = { 
//				new Wind(), 
//				new Percussion(), 
//				new Stringed(), 
//				new Brass(), 
//				new Woodwind(),
//				new Guitar(),
//		};
		tuneAll(orchestra);
		for(Instrument i : orchestra){
			System.out.println(i);
		}
	}
} /*
	 * Output: Wind.play() MIDDLE_C Percussion.play() MIDDLE_C Stringed.play()
	 * MIDDLE_C Brass.play() MIDDLE_C Woodwind.play() MIDDLE_C
	 */// :~
