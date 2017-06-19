package generics.solution.ex22;

import java.lang.reflect.InvocationTargetException;

class Foo {
	private String name;
	public Foo(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

public class Ex22 {
	public static <T> T createObject(Class<T> c, String name) {
		try {
			return c.getConstructor(String.class).newInstance(name);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
		        | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	public static void main(String[] args) {
		Foo foo = Ex22.createObject(Foo.class,"nice");
	}

}
