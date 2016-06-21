package reusing.solution;
class A {
	A(int i) {
		System.out.println("A created");
	}
}
class B{
	B(int i){
		System.out.println("B created");
	}
}

class C extends A{
	B mb = new B(3);
	C(){
		super(11);
		System.out.println("C created");
	}
}
public class Ex5 {
	public static void main(String[] args){
		C ob = new C();
	}
}
