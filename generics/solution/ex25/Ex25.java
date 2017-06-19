package generics.solution.ex25;

interface Interface1 {
	void f1();
}
interface Interface2 {
	void f2();
}
class Foo implements Interface1,Interface2 {

	@Override
	public void f2() {
		System.out.println("foo f2()");
		
	}

	@Override
	public void f1() {
		System.out.println("foo f1()");
	}
}

public class Ex25 {
	public static <T extends Interface1> void f3(T foo){
		foo.f1();
	}
	public static <T extends Interface2> void f4(T foo){
		foo.f2();
	}
	public static void main(String[] args){
		Foo foo = new Foo();
		foo.f1();
		foo.f2();
		Ex25.f3(foo);
		Ex25.f4(foo);
		for (Class i:foo.getClass().getInterfaces()){
			System.out.println("Interface " + i.getSimpleName());
		}
	}

}
