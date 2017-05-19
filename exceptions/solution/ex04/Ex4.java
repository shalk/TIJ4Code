package exceptions.solution.ex04;

class MyException extends Exception{
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
		try{
			throw new MyException("A MyException");
		} catch( MyException e){
			e.getMsg();
		}
	}

}
