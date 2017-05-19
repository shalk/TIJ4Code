package exceptions.solution.ex09;

class MyException1 extends Exception {}
class MyException2 extends Exception {}
class MyException3 extends Exception {}

public class Ex9 {

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
		System.out.println(i);
		
	}

	public static void main(String[] args) {
		try{
			foo3(1);
		} catch(Exception e){
			System.out.println(e.getClass().getName());
			System.out.println(e.getClass().getSimpleName());
			System.out.println(e.getMessage());
			e.printStackTrace(System.out);
		}
		try{
			foo3(2);
		} catch(Exception e){
			System.out.println(e.getClass().getName());
			System.out.println(e.getClass().getSimpleName());
			System.out.println(e.getMessage());
			e.printStackTrace(System.out);
		}
		try{
			foo3(3);
		} catch(Exception e){
			System.out.println(e.getClass().getName());
			System.out.println(e.getClass().getSimpleName());
			System.out.println(e.getMessage());
			e.printStackTrace(System.out);
		}
	}

}
