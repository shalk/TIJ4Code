package object.solution;

class StaticTest {
	static int i ;
}
class Incrementable {
	int j;
	static void increment() {
		StaticTest.i++;
	}
}
public class Ex7 {
	public static void main(String[] args){
		//Incrementable sf = new Incrementable();
		//sf.increment();
		Incrementable.increment();
		System.out.println(StaticTest.i);
	}
}
