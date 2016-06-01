package initialization.solution;

public class Ex18 {
	Ex18(String s){
		System.out.println("Ex18 created:" + s);
	}
	public static void main(String[] args){
		Ex18[] obs = new Ex18[5];
		for(int i = 0 ; i < 5 ; i++){
			obs[i] = new Ex18(Integer.toString(i));
		}
		
	}
}
