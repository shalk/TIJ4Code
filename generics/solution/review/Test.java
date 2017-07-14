package generics.solution.review;

import java.util.List;

class Holder<T> {
	T t;

	void setT(T t) {
		this.t = t;
	}

	T get() {
		return t;
	}
}

class Holder1<T> extends Holder<T> {

	@Override
	T get() {
		return t;

	}
}

public class Test {

	public static void main(String[] args) {
//		Holder<? extends Number> h = new Holder<Integer>();
//		Holder<? extends Number> h = new Holder<Object>();
		Holder<? super Number> h2 = new Holder<Object>();
		Integer i = 10;
		h2.setT(i);
		h2.setT(1.0);
	}
}