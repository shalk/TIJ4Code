package initialization.solution;
class Bowl {
	Bowl(){
		System.out.println("create a bowl");
	}
}
public class Test {
	Bowl w = new Bowl();
	static Bowl a = new Bowl();
	public static void main(String[] args){
		int a = 1;
	}
}
