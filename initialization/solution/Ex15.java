package initialization.solution;
class Ex151 {
	String s ;
	{
		s = new String("abc");
		System.out.println("initial Ex151.s");
	}
}
public class Ex15 {
	public static void main(String[] args){
		Ex151 a = new Ex151();
	}
}
