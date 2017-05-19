package exceptions.solution.ex28;

class MyException extends RuntimeException{
	private String msg;
	public MyException(String msg){
		super(msg);
		this.msg = msg;
	}
	public void getMsg(){
		System.out.println("===============");
		System.out.println(msg);
		System.out.println("===============");
		
	}
	
}
public class Ex4 {

	public static void main(String[] args) {
		throw new MyException("A MyException");
	}

}
