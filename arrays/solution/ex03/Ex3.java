package arrays.solution.ex03;

import java.util.Arrays;
import java.util.Random;

public class Ex3 {
	
	public static double[][] getTwoDimDoubleArray(int row, int col, int supper , int upper){
		double[][] a = new double[row][col];
		Random rand = new Random(47);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] =  rand.nextDouble() * (upper - supper) + supper;
			}
		}
		return a;
	}
	
	public static void printTwoDim(double[][] d){
//		System.out.println(Arrays.deepToString(d));
		for (int i = 0; i < d.length; i++) {
			System.out.print("[");
			for (int j = 0; j < d[i].length; j++) {
				System.out.print(d[i][j]);
				System.out.print(" ");
			}
			System.out.print("]");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printTwoDim(getTwoDimDoubleArray(5,5, 1, 10));
		printTwoDim(getTwoDimDoubleArray(2,3, 20, 30));
	}

}
