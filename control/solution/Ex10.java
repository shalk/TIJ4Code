package control.solution;
import java.util.Arrays;

public class Ex10 {
	
	public static void xixue(){
		int[] op = new int[4];
		int[] res = new int[4];
		for(int op1 = 10; op1 < 100 ; op1++){
			for(int op2 = 10; op2 < 100 ; op2++){
				int result = op1 * op2;
				if(result < 1000 || result > 9999)
					continue;
				op[0] = op1 / 10;
				op[1] = op1 % 10;
				op[2] = op2 / 10;
				op[3] = op2 % 10;
				Arrays.sort(op);
				res[0] = result / 1000; // thousands
				result = result % 1000; 
				res[1] = result / 100;   // hundreds
				result = result % 100;  
				res[2] = result / 10;   // tens
				res[3] = result % 10;   // digit
				Arrays.sort(res);
				if(op[0] == res[0]&& op[1] == res[1]
						&& op[2] == res[2]&& op[3] == res[3]){
					System.out.println("xixue: " + op1 +"*"+ op2 + "=" + (op1 * op2));
				}					
			}
		}
	}
	public static void main(String[] args){
		xixue();
	}
}
