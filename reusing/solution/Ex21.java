package reusing.solution;
class Ex21_1 {
	final void foo(){
		
	}
}
class Ex21_2 extends Ex21_1 {
	public void foo(){
		
	}
}
public class Ex21 {
	public static void main(String[] args){
		Ex21_2 ob = new Ex21_2();
	}
}
