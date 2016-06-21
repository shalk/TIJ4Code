package reusing.solution;

class Item {
	Item(String s){
		System.out.println("Hello World!" + "ps:" + s);
	}
}
class Ex23_1 {
	static Item item = new Item("static only once");
	static void foo(){
		System.out.println("Ex23_1 foo");
	}
	Ex23_1(){
		System.out.println("Ex23_1 created");
	}
}
public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ex23_1 ob1 = new Ex23_1();
//		Ex23_1 ob2 = new Ex23_1();
		Ex23_1.foo();
		Ex23_1.foo();
	}

}
