package reusing.solution;
class Ex13_1{
	void foo(int i ){
		System.out.println(i);
	}
	void foo(float i){
		System.out.println(i);
	}
	void foo(String i){
		System.out.println(i);
	}
}
class Ex13_2 extends Ex13_1 {
	
	void foo(){
		System.out.println("real new foo");
	}
}
public class Ex13 {
	public static void main(String[] args){
		Ex13_2 ob = new Ex13_2();
		ob.foo(1);
		ob.foo(1.0f);
		ob.foo("haha");
		ob.foo();
	}
}
