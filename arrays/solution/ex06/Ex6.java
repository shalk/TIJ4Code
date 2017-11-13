package arrays.solution.ex06;

import java.util.Arrays;

class Apple {
	private static int count;
	private final int id = ++count;
	
	@Override public String toString() {
		return "Apple " + id;
	}
}
public class Ex6 {
	
	public  static Apple[][] foo(int row, int col) {
		Apple[][] apps = new Apple[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				apps[i][j] = new Apple();
			}
		}
		return apps;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(foo(5, 10)));
	}

}
