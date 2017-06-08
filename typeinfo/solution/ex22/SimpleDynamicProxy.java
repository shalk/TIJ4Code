package typeinfo.solution.ex22;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Interface {
	public void dothing1();
	public void dothing2(String arg);
}

class RealObject implements Interface {
	@Override
	public void dothing1() {
		System.out.println("dothing1");
	}

	@Override
	public void dothing2(String arg) {
		System.out.println("dothing2" + arg);
	}
	
}
class DynamicProxy implements InvocationHandler{
	Object proxied;
	private int count = 0;

	public static Object newInstance(Object obj){
		return Proxy.newProxyInstance(
				obj.getClass().getClassLoader(),
				obj.getClass().getInterfaces(), 
				new DynamicProxy(obj));
	}
	public DynamicProxy(Object proxied){
		this.proxied = proxied;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		count = count + 1;
		System.out.println(method.getName() + " [" + count + "]");
		method.invoke(proxied, args);
		return null;
	}
}

public class SimpleDynamicProxy {
	public static void main(String[] args){
		Interface r = (Interface)DynamicProxy.newInstance(new RealObject());
		r.dothing1();
		r.dothing1();
		r.dothing1();
		r.dothing1();
		r.dothing2("aaa");
	}
}
