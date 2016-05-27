package control.solution;

public class Ex5 {
	public static void ToBinaryString(int val){
		String result = new String("");
		System.out.println(val);
		while(val >0){
			result = ((val % 2 ) == 0 ? "0" : 1) + result;
			val >>= 1;
		}
		System.out.println("binary:"+result);
	}
	
	public static void main(String[] args){
		for(int val = 1 ; val < 12; val++){
			boolean flag = true;
			for(int i = 2 ; i < val ; i ++){
				if( (val % i) == 0){
					flag = false;
					break;
					
				}
			}
			if(flag){
				Ex5.ToBinaryString(val);
			}
		}
	}
}
