package exceptions.solution.ex05;

public class Ex5 {

	public static void main(String[] args) {
		int count = 0;
		while(true){
			try {
				if( count < 10){
					throw new Exception();
				}
				System.out.println("works");
				break;
			} catch(Exception e){
				e.printStackTrace(System.out);
				count++;
			}
		}
		System.out.println("ends");

	}

}
