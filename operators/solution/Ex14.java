package operators.solution;

public class Ex14 {
	public static void compare(String a , String b){
		System.out.println("a == b :"  + ( a == b));
		//System.out.println("a != b :"  + ( a != b));
		System.out.println("a equals b:"  + a.equals(b));
	}
	public static void main(String[] args){
		Ex14.compare("abc","abc");
		String a1 = new String("abc");
		String a2 = new String("abc");
		Ex14.compare(a1,a2);
		String a11 = "abc";
		String a22 = "abc";
		Ex14.compare(a11,a22);
 	}
}
