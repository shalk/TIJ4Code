package interfaces.solution.ex52;
import interfaces.solution.ex51.Ex51;
public class Ex52 implements Ex51 {
	public void foo1(){
		System.out.println("foo1");
	}
	public void foo2(){
		System.out.println("foo2");
	}
	public void foo3(){
		System.out.println("foo3");
	}
	public static void main(String[] args){
		Ex52 ob = new Ex52();
		ob.foo1();
		ob.foo2();
		ob.foo3();
	}
}
