package operators.solution;
import static net.mindview.util.Print.*;
public class Ex3 {
	float temp;
	public  static void change(Ex3 y){
		y.temp = 2.3f;
	}
	public static void main(String[] args){
		Ex3 ob = new Ex3();
		ob.temp = 3.3f;
		print("ob.temp = " + ob.temp);
		Ex3.change(ob);
		print("ob.temp = " + ob.temp);
		
	}
}
