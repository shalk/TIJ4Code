package interfaces.solution;
abstract class Ex3_Base {
	Ex3_Base(){
		print();
	}
	abstract public void print();
}
class Ex3_1 extends Ex3_Base {
	int i = 3;
	@Override
	public void print(){
		System.out.println(i);
	}
}

public class Ex3 {
	public static void main(String[] args){
		Ex3_1 ob = new Ex3_1();
	}
}
