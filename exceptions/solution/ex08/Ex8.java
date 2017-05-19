package exceptions.solution.ex08;


public class Ex8 {
	static void foo() throws NullPointerException{
		throw new NullPointerException("null");
	}
	public static void main(String[] args) {
		try {
			foo();
		}catch(NullPointerException e){
			System.out.println("End");
		}
	}

}