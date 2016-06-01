package initialization.solution;
class Ex211 {
	String s1  = "abc";
	String s2;
	Ex211(){
		s2 = "cde";
	}
}
public class Ex2 {
	public static void main(String[] args){
		Ex211 a = new Ex211();
		System.out.println(a.s1);
		System.out.println(a.s2);
	}
}
