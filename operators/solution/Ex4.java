package operators.solution;
import java.util.*;
public class Ex4 {
	int distance = 100;
	float time  = 9.88f;
	
	public static void main(String[] args){
		Ex4 ob = new Ex4();
		float speed = ob.distance / ob.time;
		System.out.println("Speed:" + speed);
	}
}
