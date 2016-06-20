package access.solution;
import static net.mindview.util.Print.*;


public class Test1 {
	public void foo1(){
		print("public foo1");
	}
	protected void foo2(){
		print("protected foo2");
	}
	void foo3(){
		print("default foo3");
	}
	private void foo4(){
		print("private foo4");
	}
	public static void main(String[] args){
		Test1 a = new Test1();
		a.foo1();
		a.foo2();
		a.foo3();
		a.foo4();
	}
}
