package operators.solution;

public class Ex10 {
	public static void main(String[] args){
		int a1 = 0xaa;
		int a2 = 0x55;
		System.out.println("a1:" + Integer.toBinaryString(a1));
		System.out.println("a2:" + Integer.toBinaryString(a2));
		
		int b1 = a1 & a2;
		int b2 = a1 | a2;
		int b3 = a1 ^ a2;
		System.out.println("a1 & a2 :" + Integer.toBinaryString(b1));
		System.out.println("a1 | a2 :" + Integer.toBinaryString(b2));
		System.out.println("a1 ^ a2 :" + Integer.toBinaryString(b3));
	}
}
