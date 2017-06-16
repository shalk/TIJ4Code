package generics.solution.ex01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyExample {
	public static interface Football{
		void foot();
	}

	static public interface Basketball{
		void basket();
	}
	public static class AmericanFootBall implements Football {
		@Override
		public void foot() {
			System.out.println("AmeriacanFootBall");
		}
	}

	public static class DyProxy implements InvocationHandler {
		private final Football proxy;
		DyProxy (Football proxy){
			this.proxy = proxy;
		}
		
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println("before proxy");
			method.invoke(this.proxy, args);
			System.out.println("after proxy");
			return null;
		}
		
	}
	public static void main(String[] args) {
		Object p = Proxy.newProxyInstance(Football.class.getClassLoader(), new Class[] { Football.class }, new DyProxy(new AmericanFootBall()));
		Football f1 = (Football) p;
		f1.foot();
		try {
			Football.class.getMethod("123");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
