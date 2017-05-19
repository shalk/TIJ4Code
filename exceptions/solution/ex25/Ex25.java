package exceptions.solution.ex25;

class MyException1 extends Exception {}
class MyException2 extends MyException1 {}
class MyException3 extends MyException2 {}

class A {
	void foo() throws MyException1 {
	}
}
class B extends A {
	@Override
	void foo() throws MyException2 {
		
	}
}
class C extends B {
	@Override
	void foo() throws MyException3 {
		
	}
}
public class Ex25 {
	public static void main(String[] args){
		C c = new C();
		try {
			((A)c).foo();
		} catch (MyException1 e) {
			e.printStackTrace();
		}
	}
}
