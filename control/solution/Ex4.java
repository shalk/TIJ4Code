package control.solution;

public class Ex4 {
	public static void main(String[] args){
		for(int val = 1 ; val < 100 ; val++){
			boolean flag = true;
			for(int  i = 2; i < val; i++){
				if( (val % i) == 0 ) {
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println(val);
			}			
		}
	}
}
