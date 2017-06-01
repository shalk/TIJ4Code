package strings.solution.ex01;

class Base {
	int a3 = 0;
	static int a1 = 1;
	final static int a2 = 2;
	static {
		System.out.println("static a1="+a1);
		System.out.println("static a2="+a2);
	}
	
	Base(){
		System.out.println("Base constructor");
		System.out.println("a1="+a1);
		System.out.println("a2="+a2);
		System.out.println("a3="+a3);
	}
}

class New extends Base{

	int b3 = 0;
	static int b1 = 1;
	final static int b2 = 2;

	static {
		System.out.println("static b1="+b1);
		System.out.println("static b2="+b2);
	}

	New(){
		System.out.println("New constructor");
	}
	
}
public class Ex1 {

	public static void main(String[] args) {
		new New();
	}

}
