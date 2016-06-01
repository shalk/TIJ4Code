package initialization.solution;
class Ex91{
	Ex91(char w){
		this((int)w);
		System.out.println("construct:"+ w);	
	}
	Ex91(int i){
		System.out.println("construct int:" + i );
	}

}
public class Ex9 {
	public static void main(String[] args){
		Ex91 a = new Ex91('w');	
	}
}
