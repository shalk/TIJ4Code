package typeinfo.solution.ex25.internal;

public class Test {
	public void foo1 () {
		System.out.println("call public foo1");
	}
	protected void foo2 () {
		System.out.println("call protected foo2");
	}
	void foo3 () {
		System.out.println("call package default foo3");
	}
	private void foo4 () {
		System.out.println("call private foo4");
	}
}
