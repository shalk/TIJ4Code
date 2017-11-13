package arrays.solution.ex05;

public class Ex5 {
	public static void main(String[] args) {
		int[][] a = new int[2][3];
		if ( a[1][2] == 0){
			System.out.println("int array inital to 0");
		}
		String[][] s = new String[2][3];
		if ( s[1][2] == null){
			System.out.println("object array inital to null");
		}
		
		boolean[][] b = new boolean[2][3];
		if (! b[1][2]){
			System.out.println("boolean array inital to false");
		}

		double[][] d = new double[2][3];
		if (d[1][2] == 0.0){
			System.out.println("double array inital to 0.0");
		}
	}

}
