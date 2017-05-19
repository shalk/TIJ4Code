package exceptions.solution.ex11;


class MyException1 extends Exception {}
class MyException2 extends Exception {}
public class Ex11 {
	static void g() {
		throw new RuntimeException();
	}
	static void f() throws MyException2 {
		try {
			g();
		} catch (Exception e) {
			MyException2 e2 = new MyException2();
			e2.initCause(e);
			throw e2; 
		}
	}
	public static void main(String[] args){
		try {
			f();
		} catch (MyException2 e) {
//			e.printStackTrace();
			for(StackTraceElement element :e.getStackTrace()){
				System.out.println(element.toString());
			}
		}
	}
}
