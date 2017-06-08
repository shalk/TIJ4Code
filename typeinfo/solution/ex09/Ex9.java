package typeinfo.solution.ex09;

import java.lang.reflect.Field;

class Base {
	private String baseString;
}
class Square extends Base {
	private int length;	
	public String wow;
}
class BigSquare extends Square {
	private int biglength;
	private int bigwidth;
	public boolean big;
}

public class Ex9 {
	public static void printInheritClass(Class t){
		if(t.getSuperclass() == null){
			System.out.println("Class:" + t.getName());
			for(Field field: t.getDeclaredFields()){
				System.out.println(" Field:" + field.getType().getName() + " "+ field.getName());
			}
			return;
		}
		printInheritClass(t.getSuperclass());
		System.out.println("Class:" + t.getName());
		for(Field field: t.getDeclaredFields()){
			System.out.println(" Field:" + field.getType().getName() + " " + field.getName());
		}
	}
	public static void main(String[] args) {
		Ex9.printInheritClass(new BigSquare().getClass());

	}

}
