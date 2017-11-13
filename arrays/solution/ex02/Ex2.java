package arrays.solution.ex02;

import java.util.Arrays;

class Apple {
	private static int count = 0;
	private final int id = ++count;
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + id;
	}
}
public class Ex2 {
	public static Apple[] newApples(int i) {
		if (i < 0) {
			return new Apple[0];
		} 
		Apple[] ret = new Apple[i];
		for (int j = 0 ; j < ret.length ;j++) {
			ret[j] = new Apple();
		}
		return ret;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(newApples(10)));
		
	}
}
