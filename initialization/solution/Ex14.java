package initialization.solution;
import static net.mindview.util.Print.*;

class Ex141 {
	static String i = new String("abc");
	static String j ;
	static {
		j = new String("def");
	}
	static void display(){
		print(i);
		print(j);
	}
}
public class Ex14 {
	public static void main(String[] args){
		Ex141 a = new Ex141();
		a.display();
	}
}
