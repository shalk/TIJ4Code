package generics.solution.ex28; 

class Generic1<T> {
	public void foo1(T item){
		System.out.println("foo1:" + item.toString());
	}
}
class Generic2<T> {
	T t;
	public T foo2() {
		System.out.println("foo2:" + t.toString());
		return t;
	}
}

public class Ex28 {
	public static <T> void foo3(Generic1<? super T> gen, T item){
		gen.foo1(item);
	}

	public static<T>  T foo4(Generic2<? extends T> gen) {
		return gen.foo2();
	}

	public static void main(String[] args) {
		Generic1<String> gen1 = new Generic1<>();
		Generic2<String> gen2 = new Generic2<>();
		gen2.t = new String("nice");
		Ex28.foo3(gen1,"nice to meet you");
		Ex28.foo4(gen2);
	}
}
