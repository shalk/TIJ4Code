package access.solution;

public class InsideEx4 {
	public static void main(String[] args){
		Ex4 a = new Ex4();
		a.foo1();   //package access
		a.foo2();   // public access
		a.foo3();  //protected have package access privilege
	}
}
