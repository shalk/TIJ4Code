package exceptions.solution.ex13;

class MyException1 extends Exception {}
class MyException2 extends Exception {}
class MyException3 extends Exception {}

public class Ex13 {

	static void foo3(int i) throws MyException1, MyException2,MyException3{
		if( i == 1){
			throw new MyException1();
		}
		if( i == 2){
			throw new MyException2();
		}
		if( i == 3){
			throw new MyException3();
		}
		if (i == 4){
			throw new NullPointerException();
		}
		System.out.println(i);
		
	}

	public static void main(String[] args) {
		for(int i = 1; i < 5; i++){
			try {
				foo3(i);
			} catch (Exception e) {
//				System.out.println(e.getClass().getName());
//				System.out.println(e.getClass().getSimpleName());
//				System.out.println(e.getCause());
//				e.printStackTrace(System.out);
			} finally {
				System.out.println("Finally" + i);
			}
		}

	}

}
