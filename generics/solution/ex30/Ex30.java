package generics.solution.ex30;

import generics.Holder;
import static net.mindview.util.Print.*;

class Holders {
	public static <T> Holder<T> generator( T t) {
		Holder<T> h = new Holder<T>();
		h.set(t);
		return h;
	}
}
public class Ex30 {
	public static void main(String[] args) {
		Holder<Integer> h1 = Holders.generator(0);
		int i = h1.get();
		h1.set(i);

		Holder<Short> h2 = Holders.generator((short)2);
		short s = h2.get();
		h2.set(s);

		Holder<Long> h3 = Holders.generator(200L);
		long l = h3.get();
		h3.set(l);

		Holder<Double> h4 = Holders.generator(2.00);
		double d = h4.get();
		h4.set(d);

		Holder<Float> h5 = Holders.generator(3.14f);
		float f = h5.get();
		h5.set(f);

		Holder<Byte> h6 = Holders.generator((byte)2);
		byte b = h6.get();
		h6.set(b);

		Holder<Character> h7 = Holders.generator('c');
		char c = h7.get();
		h7.set(c);
		

		Holder<Boolean> h8 = Holders.generator(true);
		boolean bool = h8.get();
		h8.set(bool);
	}
}
