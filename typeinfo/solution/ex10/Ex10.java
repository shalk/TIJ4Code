package typeinfo.solution.ex10;
import typeinfo.solution.ex08.*;
public class Ex10 {

	public static void main(String[] args) {
		char[] letterCharArray =  new char[]{'a', 'e', 'i', 'o', 'u'};
		System.out.println("Before Print Inherit");
		Ex8.printInheritClass(letterCharArray.getClass());
		System.out.println("After Print Inherit");
		
		if(letterCharArray instanceof Object){
			System.out.println("chararray is Object");
		}else{
			System.out.println("chararray is not Object");
		}

		if( Object.class.isInstance(letterCharArray)){
			System.out.println("chararray is Object");
		}else{
			System.out.println("chararray is not Object");
		}
	}

}
