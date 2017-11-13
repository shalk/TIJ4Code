package arrays.solution.ex09;

public class Peel<T> {
	T t;
	private static int count;
	private final int id = ++count;

	Peel(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Peel " + id + " hold  " + t;
	}
}
