package arrays.solution.ex04;

import java.util.Arrays;
import java.util.Random;

public class Ex4 {
	
	public static double[][][] getTreeDimDoubleArray(int row, int col, int depth, int supper , int upper){
		double[][][] a = new double[row][col][depth];
		Random rand = new Random(47);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				for (int p = 0; p < depth; p++) {
					a[i][j][p] =  rand.nextDouble() * (upper - supper) + supper;
				}
			}
		}
		return a;
	}
	
	public static void printTwoDim(double[][][] d){
		System.out.println(Arrays.deepToString(d));
//		for (int i = 0; i < d.length; i++) {
//			System.out.print("[");
//			for (int j = 0; j < d[i].length; j++) {
//				System.out.print(d[i][j]);
//				System.out.print(" ");
//			}
//			System.out.print("]");
//			System.out.println();
//		}
	}
	
	public static void main(String[] args) {
		printTwoDim(getTreeDimDoubleArray(5,5,2 ,1, 10));
		printTwoDim(getTreeDimDoubleArray(2,3,2 ,20, 30 ));
	}

}
