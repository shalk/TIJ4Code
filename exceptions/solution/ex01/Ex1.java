package exceptions.solution.ex01;




public class Ex1 {
	public static void main(String[] args) {
		try {
			throw new Exception("throw new Exception");
		} catch(Exception e){
			System.out.println(e.getMessage());
		} finally {
			System.out.println("exception end");
		}
	}
}
