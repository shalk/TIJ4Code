package generics.solution.ex20;

interface Foo {
	public void method1();

	public void method2();
}

class FooImp implements Foo {

	@Override
	public void method1() {
		System.out.println("fooimp method1");

	}

	@Override
	public void method2() {
		System.out.println("fooimp method2");
	}

	public void method3() {
		System.out.println("fooimp method3 by its own");
	}

}

public class Ex20 {
	public static <T extends Foo> void test(T foo) {
		foo.method1();
		foo.method2();
	}

	public static void main(String[] args) {
		Ex20.test(new FooImp());
	}
}

