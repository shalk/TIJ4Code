package generics.solution.ex26;

public class Ex26 {
	public static void main(String[] args) {
		Number[] numbers = new Integer[10];
		numbers[0] = 10;
		numbers[1] = new Integer(12);
		try {
			numbers[2] = 0.1;
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			numbers[3] = 0.1f;
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
