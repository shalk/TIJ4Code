package arrays.solution.ex11;

public class Ex11 {

	public static void foo1(int i) {
		System.out.println(i);
	}

	public static void foo2(int i) {
		System.out.println(i);
	}
	
	public static void foo3(int[] i) {
		System.out.println(i);
	}

	public static void foo4(Integer[] i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		int i1 = 3;
		foo1(i1);
		foo2(i1);
		Integer i2 = new Integer(10);
		foo1(i2);
		foo2(i2);
		
		int[] i3 = new int[]{2, 3};
		Integer[] i4 = new Integer[]{5, 6};
		foo3(i3);
//		foo3(i4); can not autobox
//		foo4(i3); can not autobox
		foo4(i4);


	}

}
