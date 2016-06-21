package reusing.solution;

public class Ex18 {
	final static String name = "hello";
	final int id ;
	Ex18(int i){
		id = i;
	}
	public static void main(String[] args){
		Ex18 ob1 = new Ex18(1);
		Ex18 ob2 = new Ex18(2);
		System.out.println(ob1.name);
		System.out.println(ob1.id);
		System.out.println(ob2.name);
		System.out.println(ob2.id);
		
	}
}
