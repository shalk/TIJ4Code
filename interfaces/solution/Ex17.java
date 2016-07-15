package interfaces.solution;
interface Ex17_1 {
	int a = 1;
	String b = new String("abcdef");
}
public class Ex17 implements Ex17_1 {
	public static void main(String[] args){
		Ex17 ob1 = new Ex17();
	//	ob1.a = 3;  value in interface is final
		Ex17 ob2 = new Ex17();
		if(ob1.b  == ob2.b){
			System.out.println("value in interface is static");
		}
		String b1 = new String("abcdef");
		String b2 = new String("abcdef");
		if(b1 == b2){
			System.out.println("b1 == b2");
		}else {
			System.out.println("String b1 b2 is different object");
		}
	}
}
