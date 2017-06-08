package typeinfo.solution.ex08;


class Base {}
class Square extends Base {}
class BigSquare extends Square {}

public class Ex8 {
	public static void printInheritClass(Class t){
		if(t.getSuperclass() == null){
			System.out.println("Class:" + t.getName());
			return;
		}
		printInheritClass(t.getSuperclass());
		System.out.println("Class:" + t.getName());
	}
	public static void main(String[] args) {
		Ex8.printInheritClass(new BigSquare().getClass());

	}

}
