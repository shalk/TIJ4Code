package operators.solution;

import java.util.*;


public class Ex7 {
	public static void main(String[] args){
		Random ob = new Random(2);
		int num = ob.nextInt(101);
		System.out.println(num);
		if( num < 50 ){
			System.out.println("front");
		}else if (num > 50){
			System.out.println("back");
		}else{
			System.out.println("standup");
		}
	}
}
///:~
