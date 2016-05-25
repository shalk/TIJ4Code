package object.solution;

public class Ex6 {
	int storage ( String s){
		return s.length() * 2;
	}
	public static void main(String[] args){
		Ex6 a =  new Ex6();
		a.storage("Hello");
	}
}
