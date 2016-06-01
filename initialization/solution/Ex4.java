package initialization.solution;
class Ex41 {
	Ex41(){
		System.out.println("create Ex41 default");
	}
	Ex41(String s){
		System.out.println("create Ex41:"+ s);
	}
}
public class Ex4 {
	public static void main(String[] args){
		Ex41 a = new Ex41("hello 41");
	}
}
