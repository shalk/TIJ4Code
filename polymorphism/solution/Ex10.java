package polymorphism.solution;
class Base {
	public void foo1(){
		System.out.println("foo1");
		foo2();
	}
	public void foo2(){
		System.out.println("foo2");
	}
}
class Ex10_1 extends Base {
	@Override
	public void foo2() {
		System.out.println("Ex10_1 foo2");
	}
}
public class Ex10 {
	public static void main(String[] args){
		Ex10_1 ob = new Ex10_1();
		ob.foo1();
	}
}
