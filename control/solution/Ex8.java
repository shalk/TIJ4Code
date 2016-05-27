package control.solution;
import java.util.*;
public class Ex8 {
	public static void main(String[] args){
		Random r = new Random(40);
		for(int i = 0 ; i < 10 ; i++){
			int num = 'a' + r.nextInt(2);
			System.out.println("char:" +  (char)(num));
			switch(num){
			case('a'): System.out.println("match a "); //break;
			case('b'): System.out.println("match b");// break;
			default: break;
			}
		}
	}
}
