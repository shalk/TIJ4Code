//: generics/Functional.java
package generics.solution.ex42; /* Added by Eclipse.py */

import java.math.*;
import java.util.concurrent.atomic.*;
import java.util.function.Consumer;

import generics.solution.ex41.Fill2;
import net.mindview.util.Generator;

import java.util.*;
import static net.mindview.util.Print.*;

// Different types of function objects:
interface Combiner<T> {
	T combine(T x, T y);
}

interface UnaryFunction<R, T> {
	R function(T x);
}

interface Collector<T> extends UnaryFunction<T, T> {
	T result(); // Extract result of collecting parameter
}

interface UnaryPredicate<T> {
	boolean test(T x);
}
class Test1 {
	public int val1;

	public int getVal1() {
		return val1;
	}

	public Test1 setVal1(int val1) {
		this.val1 = val1;
		return this;
	}
	public String toString() {
		return "Test1 " + val1;
	}
	
	public static Generator<Test1> generator(){
		return new Generator<Test1>() {
			public  Random random = new Random(47);
			@Override
			public Test1 next() {
				return new Test1().setVal1(random.nextInt(100));
			}
			
		};
		
	}
}

class Test2 {
	public int val2;

	public int getVal2() {
		return val2;
	}

	public void setVal2(int val2) {
		this.val2 = val2;
	}
	public String toString() {
		return "Test2 " + val2;
	}
}
public class Functional {
	// Calls the Combiner object on each element to combine
	// it with a running result, which is finally returned:
	public static <T> T reduce(Iterable<T> seq, Combiner<T> combiner) {
		Iterator<T> it = seq.iterator();
		if (it.hasNext()) {
			T result = it.next();
			while (it.hasNext())
				result = combiner.combine(result, it.next());
			return result;
		}
		// If seq is the empty list:
		return null; // Or throw exception
	}

	// Take a function object and call it on each object in
	// the list, ignoring the return value. The function
	// object may act as a collecting parameter, so it is
	// returned at the end.
	public static <T> Collector<T> forEach(Iterable<T> seq, Collector<T> func) {
		for (T t : seq)
			func.function(t);
		return func;
	}

	// Creates a list of results by calling a
	// function object for each object in the list:
	public static <R, T> List<R> transform(Iterable<T> seq, UnaryFunction<R, T> func) {
		List<R> result = new ArrayList<R>();
		for (T t : seq)
			result.add(func.function(t));
		return result;
	}

	// Applies a unary predicate to each item in a sequence,
	// and returns a list of items that produced "true":
	public static <T> List<T> filter(Iterable<T> seq, UnaryPredicate<T> pred) {
		List<T> result = new ArrayList<T>();
		for (T t : seq)
			if (pred.test(t))
				result.add(t);
		return result;
	}

	// To use the above generic methods, we need to create
	// function objects to adapt to our particular needs:
	static class IntegerAdder implements Combiner<Integer> {
		public Integer combine(Integer x, Integer y) {
			return x + y;
		}
	}

	static class IntegerSubtracter implements Combiner<Integer> {
		public Integer combine(Integer x, Integer y) {
			return x - y;
		}
	}

	static class BigDecimalAdder implements Combiner<BigDecimal> {
		public BigDecimal combine(BigDecimal x, BigDecimal y) {
			return x.add(y);
		}
	}

	static class BigIntegerAdder implements Combiner<BigInteger> {
		public BigInteger combine(BigInteger x, BigInteger y) {
			return x.add(y);
		}
	}

	static class AtomicLongAdder implements Combiner<AtomicLong> {
		public AtomicLong combine(AtomicLong x, AtomicLong y) {
			// Not clear whether this is meaningful:
			return new AtomicLong(x.addAndGet(y.get()));
		}
	}

	// We can even make a UnaryFunction with an "ulp"
	// (Units in the last place):
	static class BigDecimalUlp implements UnaryFunction<BigDecimal, BigDecimal> {
		public BigDecimal function(BigDecimal x) {
			return x.ulp();
		}
	}

	static class GreaterThan<T extends Comparable<T>> implements UnaryPredicate<T> {
		private T bound;

		public GreaterThan(T bound) {
			this.bound = bound;
		}

		public boolean test(T x) {
			return x.compareTo(bound) > 0;
		}
	}

	static class MultiplyingIntegerCollector implements Collector<Integer> {
		private Integer val = 1;

		public Integer function(Integer x) {
			val *= x;
			return val;
		}

		public Integer result() {
			return val;
		}
	}


	
	static class  SquareTest1 implements Collector<Test1> {
		@Override
		public Test1 function(Test1 x) {
			// TODO Auto-generated method stub
			x.setVal1(x.getVal1() * x.getVal1());
			return x;
		}

		@Override
		public Test1 result() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	static class SquareTest11 implements Consumer<Test1> {

		@Override
		public void accept(Test1 x) {
			x.setVal1(x.getVal1() * x.getVal1());
		}
		
	}

	public static void main(String[] args) {
		// Generics, varargs & boxing working together:
		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		Integer result = reduce(li, new IntegerAdder());
		print(result);

		result = reduce(li, new IntegerSubtracter());
		print(result);

		print(filter(li, new GreaterThan<Integer>(4)));

		print(forEach(li, new MultiplyingIntegerCollector()).result());

		print(forEach(filter(li, new GreaterThan<Integer>(4)), new MultiplyingIntegerCollector()).result());

		MathContext mc = new MathContext(7);
		List<BigDecimal> lbd = Arrays.asList(new BigDecimal(1.1, mc), new BigDecimal(2.2, mc), new BigDecimal(3.3, mc),
		        new BigDecimal(4.4, mc));
		BigDecimal rbd = reduce(lbd, new BigDecimalAdder());
		print(rbd);

		print(filter(lbd, new GreaterThan<BigDecimal>(new BigDecimal(3))));

		// Use the prime-generation facility of BigInteger:
		List<BigInteger> lbi = new ArrayList<BigInteger>();
		BigInteger bi = BigInteger.valueOf(11);
		for (int i = 0; i < 11; i++) {
			lbi.add(bi);
			bi = bi.nextProbablePrime();
		}
		print(lbi);

		BigInteger rbi = reduce(lbi, new BigIntegerAdder());
		print(rbi);
		// The sum of this list of primes is also prime:
		print(rbi.isProbablePrime(5));

		List<AtomicLong> lal = Arrays.asList(new AtomicLong(11), new AtomicLong(47), new AtomicLong(74),
		        new AtomicLong(133));
		AtomicLong ral = reduce(lal, new AtomicLongAdder());
		print(ral);

		print(transform(lbd, new BigDecimalUlp()));
		List<Test1> list1  = new ArrayList<>();
		list1.add(new Test1().setVal1(3));
		list1.add(new Test1().setVal1(4));
		print(list1);
		forEach(list1, new SquareTest1());
		print(list1);
		list1.stream().forEach(p -> p.setVal1(p.val1 * p.val1));
		print(list1);
	}
} /*
   * Output: 28 -26 [5, 6, 7] 5040 210 11.000000 [3.300000, 4.400000] [11, 13,
   * 17, 19, 23, 29, 31, 37, 41, 43, 47] 311 true 265 [0.000001, 0.000001,
   * 0.000001, 0.000001]
   */// :~
