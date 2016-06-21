package reusing.solution;
class Ex19_1{
	private String name ;
	Ex19_1(String name){
		this.name = name;
		System.out.println("Ex19_1 created");
	}
	void foo(){
		System.out.println("name:" + name);
		System.out.println("Ex19_1 foo");
	}
}
public class Ex19 {
	final Ex19_1 a;
	Ex19(String s){
		a = new Ex19_1(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex19 ob1 = new Ex19("ob1");
		Ex19 ob2 = new Ex19("ob2");
		ob1.a.foo();
		ob2.a.foo();
//		ob1.a = new Ex19_1("3");
	}

}
