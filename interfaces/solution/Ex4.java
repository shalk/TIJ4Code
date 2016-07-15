package interfaces.solution;
abstract class Ex4_1 {
	abstract void foo();
}
class Ex4_2 extends Ex4_1 {
	void foo(){
		System.out.println("foo");
	}
}
public class Ex4 {
	public static void test(Ex4_1 s){
		s.foo();
//		((Ex4_2)s).foo();
	}
	public static void main(String[] args){
		Ex4.test(new Ex4_2());
	}
}
