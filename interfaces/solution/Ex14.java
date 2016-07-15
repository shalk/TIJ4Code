package interfaces.solution;

interface Ex14_1 {
	void foo1();

	void foo2();
}

interface Ex14_2 {
	void foo3();

	void foo4();
}

interface Ex14_3 {
	void foo5();

	void foo6();
}

interface Ex14_4 extends Ex14_1, Ex14_2, Ex14_3 {
	void foo7();
}

//class Ex14_5 {
//	void foo8() {
//		System.out.println("this is Ex14_5 foo8");
//	}
//}
abstract class Ex14_5 {
	void foo8() {
		System.out.println("this is Ex14_5 foo8");
	}
	abstract void foo9();
}
class Ex14_6 extends Ex14_5 implements Ex14_4 {
	public void foo1() {
		System.out.println("foo1 in Ex14_6");
	};

	public void foo2() {
	};

	public void foo3() {
		System.out.println("foo3 in Ex14_6");
	};

	public void foo4() {
	};

	public void foo5() {
		System.out.println("foo5 in Ex14_6");
	};

	public void foo6() {
	};

	public void foo7() {
		System.out.println("foo7 in Ex14_6");
	};
	public void foo9() {
		
	}  // must override abstract method in super class  
}

public class Ex14 {
	public static void w(Ex14_1 ob) {
		ob.foo1();
	}

	public static void x(Ex14_2 ob) {
		ob.foo3();
	}

	public static void y(Ex14_3 ob) {
		ob.foo5();
	}

	public static void z(Ex14_4 ob) {
		ob.foo7();
	}

	public static void main(String[] args) {
		Ex14_6 ob = new Ex14_6();
		w(ob);
		x(ob);
		y(ob);
		z(ob);
	}
}
