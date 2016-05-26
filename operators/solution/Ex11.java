package operators.solution;
import static net.mindview.util.Print.*;
public class Ex11 {
	public static void main(String[] args){
		int a1 = 0xf;
		print(Integer.toBinaryString(a1));
		a1 >>= 1;
		print(Integer.toBinaryString(a1));
		a1 >>= 1;
		print(Integer.toBinaryString(a1));
		a1 >>= 1;
		print(Integer.toBinaryString(a1));
		a1 >>= 1;
		print(Integer.toBinaryString(a1));	
	}
}
