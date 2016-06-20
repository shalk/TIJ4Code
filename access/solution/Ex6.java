package access.solution;
class Ex61 {
	protected int i = 3;
}
class Ex62 {
	void change(Ex61 a){
		a.i = 4;
	}
}
public class Ex6 {
	public static void main(String[] args){
		Ex61 a1 = new Ex61();
		Ex62 a2 = new Ex62();
		System.out.println(a1.i);
		a2.change(a1);
		System.out.println(a1.i);
	}
}
