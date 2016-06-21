package reusing.solution;
class Base {
	Base(int i ){
		System.out.println("init Base");
	}
}
class Base1 extends Base {
	Base1(){
		super(1);
		System.out.println("Base1");
	}
	Base1(int i){
		super(1);
		System.out.println("Base1");
	}
}
public class Ex8 {
	
}
