package object.solution;
//自动包装功能
public class Ex9 {
	// 32bit
	private int i = 10;
	// 16bit
	private short s = 5;
	// 64bit
	private long l = 3;
	// 16bit
	private char c = 'w';
	private boolean b = true;
	private byte  byte1 = 0x8;
	private float f = 1.1f;
	private double d = 2.2;
	public static void main(String[] args){
		Ex9 ob = new Ex9();
		// basic type to Wrapper 
		Integer a1 = ob.i;
		Short   a2 = ob.s;
		Long a3 = ob.l;
		Byte a4 = ob.byte1;
		Float a5 = ob.f;
		Double a6 = ob.d;
		Boolean a7 = ob.b;
		Character a8 = ob.c;
		// Wrapper to basic type
		int b1 = a1;
		short b2 = a2;
		long b3 = a3;
		byte b4 = a4;
		float b5 = a5;
		double b6 = a6;
		boolean b7 = a7;
		char b8 = a8;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		System.out.println(b8);
		
	
	}
	
}
