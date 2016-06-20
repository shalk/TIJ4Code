/**
 * 
 */
package access.solution;
import static net.mindview.util.Print.*;
/**
 * @author shalk
 *
 */
public class Ex5 {
	int a1;
	public int a2;
	private int a3;
	protected int a4;
	void foo1() {
		print("defualt foo1");
	}
	public void foo2() {
		print("public foo2");
	}
	private void foo3(){
		print("private foo3");
	}
	protected void foo4(){
		print("protected foo4");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex5 ob = new Ex5();
		ob.a1 = 1;
		ob.a2 = 2;
		ob.a3 = 3;
		ob.a4 = 4;
		ob.foo1();
		ob.foo2();
		ob.foo3();
		ob.foo4();
	}

}
