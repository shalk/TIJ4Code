package exceptions.solution.ex10;
class MyException1 extends Exception {}
class MyException2 extends Exception {}
public class Ex10 {
	static void g() throws MyException1 {
		throw new MyException1();
	}
	static void f() throws MyException2 {
		try {
			g();
		} catch (MyException1 e) {
			MyException2 e2 = new MyException2();
			e2.initCause(e);
			throw e2; 
		}
	}
	public static void main(String[] args){
		try {
			f();
		} catch (MyException2 e) {
			e.printStackTrace();
		}
		try {
			g();
		} catch (MyException1 e) {
			e.printStackTrace();
		}
	}
}
