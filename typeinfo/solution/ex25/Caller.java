package typeinfo.solution.ex25;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import typeinfo.solution.ex25.internal.Test;

public class Caller {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Test a = new Test();
/*		for(Method m: a.getClass().getDeclaredMethods()){
//			System.out.println(m.getName().replace("\\w+\\.", ""));
			System.out.println(m.getName());
			m.setAccessible(true);
			m.invoke(a);
		}
*/		
		String[] methodNames = new String[]{"foo1","foo2","foo3","foo4"};
		for(String methodName: methodNames){
//			System.out.println(m.getName().replace("\\w+\\.", ""));
			Method m;
			try {
				m = a.getClass().getDeclaredMethod(methodName);
				System.out.println(m.getName());
				m.setAccessible(true);
				m.invoke(a);
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}
	}
}
