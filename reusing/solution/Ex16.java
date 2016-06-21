package reusing.solution;
class Amphibian {
	void foo(){
		System.out.println("foo");
	}
}
class Frog extends Amphibian {
	void foo(){
		System.out.println("new foo");
	}
}
public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amphibian frog = new Frog();
		frog.foo();
	}

}
