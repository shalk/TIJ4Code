package object.solution;
class StaticTest1 {
	static int i ;
}

public class Ex8 {
	public static void main(String[] args){
		StaticTest1 a = new StaticTest1();
		StaticTest1 b = new StaticTest1();
		StaticTest1 c = new StaticTest1();
		a.i = 3;
		b.i = 4;
		c.i = 5;
		System.out.println(a.i);
		System.out.println(StaticTest1.i);
	}
}
