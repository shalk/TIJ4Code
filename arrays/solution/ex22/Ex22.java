package arrays.solution.ex22;

import java.util.Arrays;

public class Ex22 {

	public static void main(String[] args) {
		int a[] = new int[]{3, 5, 4, 8, 6, 4, 6};
		// get 3 OK
		System.out.println(Arrays.binarySearch(a, 8));
		// get -2 Error
		System.out.println(Arrays.binarySearch(a, 4));
		// get -4 Error
		System.out.println(Arrays.binarySearch(a, 6));

		Arrays.sort(a);
		// get 1
		System.out.println(Arrays.binarySearch(a, 4));
		// get 5
		System.out.println(Arrays.binarySearch(a, 6));

	}
}
