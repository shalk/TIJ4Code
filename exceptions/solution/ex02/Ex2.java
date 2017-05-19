package exceptions.solution.ex02;

class Foo {
	void test(){
		
	}
}
public class Ex2 {
	public static void main(String[] args) {
		Foo f = null;
		try {
			f.test();
		} catch( NullPointerException e){
			e.printStackTrace(System.out);
		}
	}

}
