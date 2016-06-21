package reusing.solution;
class ExFoo4 {
	public ExFoo4(){
		System.out.println("Create ExFoo4");
	}
}
class ExFooSon4 extends ExFoo4 {
	public ExFooSon4(){
		System.out.println("default ExFooSon4 created");
	}
	public ExFooSon4(int i){
		System.out.println("ExFooSon4 created " + i);
	}
}
public class Ex4 {
	public static void main(String[] args){
		ExFooSon4 ob1 = new ExFooSon4();
		ExFooSon4 ob2 = new ExFooSon4(3);
	}
}
