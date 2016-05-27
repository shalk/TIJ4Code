package control.solution;

import java.util.Random;

public class Ex3 {
	public static void main(String[] args){
		Random r = new Random(20);
		int num = r.nextInt(100);
		while(true){
			int next = r.nextInt(100);
			if(num < next){
				System.out.println(num + "<" + next);
			}else if ( num > next){
				System.out.println(num + ">" + next);
				
			}else {
				System.out.println(num + "=" + next );
			}
			num = next;
		}
	}
}
