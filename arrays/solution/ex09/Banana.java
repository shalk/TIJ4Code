package arrays.solution.ex09;

public class Banana {

	private static int count;
	private final int id = ++count;

	@Override
	public String toString() {
		return "Banana " + id;
	}

}
