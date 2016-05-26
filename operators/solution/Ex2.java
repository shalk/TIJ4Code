package operators.solution;
import static net.mindview.util.Print.*;
public class Ex2 {
	float temp;
	public static void main(String[] args) {
		Ex2 ob1 = new Ex2();
		Ex2 ob2 = new Ex2();
		ob1.temp = 1.1f;
		ob2.temp = 2.2f;
		print("ob1.temp = " + ob1.temp);
		print("ob2.temp = " + ob2.temp);
		ob1 = ob2;
		ob2.temp = 3.3f;
		ob1.temp = 2.4f;
		print("ob1.temp = " + ob1.temp + ob1);
		print("ob2.temp = " + ob2.temp);
	}
}
