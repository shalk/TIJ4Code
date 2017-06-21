package generics.solution.ex34;


abstract class Base<T extends Base<T>> {
	abstract T foo1(T t) ;
	T foo2(T t){
		System.out.println("foo2:" + t.toString());
		return foo1(t);
	}
}

class Test extends Base<Test> {
	public static int count;
	public final int id = ++count;

	@Override
	Test foo1(Test t) {
		System.out.println("foo1:" + t.toString());
		return t;
	}
	
	public String toString() {
		return "Class Test " + id;
	}
}

public class Ex34 {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.foo1(t1).foo2(t1);
	}
}
