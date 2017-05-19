package exceptions.solution.ex03;

public class Ex3 {

	public static void main(String[] args) {
		try {
			int[] intarrays = new int[3];
			intarrays[3] = 4;
		} catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace(System.out);
		}
	}

}
