package reusing.solution;
class ExFoo3 {
	public ExFoo3(){
		System.out.println("Create ExFoo3");
	}
}
class ExFooSon3 extends ExFoo3 {
	
}
public class Ex3 {
	public static void main(String[] args){
		ExFooSon3 ob = new ExFooSon3();
	}
}
