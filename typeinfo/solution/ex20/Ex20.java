package typeinfo.solution.ex20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

interface Inter1 {}
interface Inter2 {}
interface Inter3 {}

class Base {
	public void basefoo1(){}
	public void basefoo2(){}
	public void basefoo3(){}
}

public class Ex20 extends Base implements Inter1, Inter2, Inter3{
	/**
	 * java Ex20 typeinfo.solution.ex20.Ex20
	 */
	public int field1;
	public int field2;
	public int field3;
	
	Ex20(){}
	Ex20(int i){}
	Ex20(double d){}

	public void foo1(){}
	public void foo2(){}
	public void foo3(){}

	public static void main(String[] args) throws ClassNotFoundException {
		if( args.length == 0){
			System.out.println("Usage: Ex20 ClassName");
			System.exit(0);
		}
		String regex = "\\w+\\.";
		Pattern p = Pattern.compile("\\w+\\.");

		String className = args[0];
		Class c = Class.forName(className);
		if(c==null){
			System.exit(0);
		}
		System.out.println("Class Name:" + p.matcher(c.getName()).replaceAll(""));
		System.out.println("Class Canonical Name:" + c.getCanonicalName().replaceAll(regex, ""));

		for(Class i: c.getInterfaces()){
			System.out.println("Interface: " + i.toString().replaceAll(regex, ""));
			
		}
		if(c.getSuperclass() != null){
			System.out.println("SuperClass: " + c.getSuperclass().getName().replaceAll(regex, ""));
		}

		for(Field f: c.getFields()){
			System.out.println("Field: " + f.toString().replaceAll(regex, ""));
			
		}

		for(Method m: c.getMethods()){
			System.out.println("Method: " + m.toString().replaceAll(regex, ""));
		}
		

		for(Constructor con: c.getConstructors()){
			System.out.println("Constructor: " + con.toString().replaceAll(regex, ""));
		}
	}
}
