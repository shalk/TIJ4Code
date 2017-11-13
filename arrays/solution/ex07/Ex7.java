package arrays.solution.ex07;

import java.util.Arrays;

class Apple {
	private static int count;
	private final int id = ++count;
	
	@Override public String toString() {
		return "Apple " + id;
	}
}
public class Ex7 {
	
	public  static Apple[][][] foo(int row, int col, int dep) {
		Apple[][][] apps = new Apple[row][col][dep];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				for ( int p = 0; p < dep; p++) {
					apps[i][j][p] = new Apple();
				}
			}
		}
		return apps;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(foo(2,3,4)));
	}

}
