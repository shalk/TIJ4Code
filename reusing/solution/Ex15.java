package reusing.solution;

public class Ex15 {
	protected void foo(){
		System.out.println("protected foo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex15 ob = new Ex15();
		ob.foo();
	}

}
