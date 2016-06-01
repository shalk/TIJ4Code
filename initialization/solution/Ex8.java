package initialization.solution;
class Ex81 {
	void foo1(){
		System.out.println("foo1");
		foo2();
		this.foo2();
	}
	void foo2(){
		System.out.println("foo2");
	}
}


public class Ex8 {
	public static void main(String[] args){
		Ex81 a = new Ex81();
		a.foo1();
	}
}
