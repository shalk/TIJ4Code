package exceptions.solution.ex27;

public class Ex27 {

	public static void main(String[] args) {
		try {
			int[] intarrays = new int[3];
			intarrays[3] = 4;
		} catch(RuntimeException e){
			e.printStackTrace(System.out);
		}
	}

}
