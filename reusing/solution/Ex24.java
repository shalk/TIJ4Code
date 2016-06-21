package reusing.solution;

//: reusing/Beetle.java
//The full process of initialization.
import static net.mindview.util.Print.*;

class Insect {
	private int i = 9;
	protected int j;

	Insect() {
		print("i = " + i + ", j = " + j);
		j = 39;
	}

	private static int x1 = printInit("static Insect.x1 initialized");

	static int printInit(String s) {
		print(s);
		return s.length();
	}
}

class Beetle extends Insect {
	protected int k = printInit("Beetle.k initialized");

	public Beetle() {
		print("k = " + k);
		print("j = " + j);
	}

	private static int x2 = printInit("static Beetle.x2 initialized");

	public static void main(String[] args) {
		print("Beetle constructor");
		Beetle b = new Beetle();
	}
}

class Beetle1 extends Beetle {
	private static int x3 = printInit("static Beetle1.x3 initialized");
	private int t  = printInit("int Beetle1.t initialized");
	Beetle1(){
		print("j =" + j);
		print("k =" + k);
		print("t =" + t);
	}
}
public class Ex24 {
	public static void main(String[] args){
		Beetle1 ob = new Beetle1();
		
	}
}
