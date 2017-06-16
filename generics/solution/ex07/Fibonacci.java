//: generics/Fibonacci.java
package generics.solution.ex07; /* Added by Eclipse.py */
import java.util.Iterator;

// Generate a Fibonacci sequence.
import net.mindview.util.*;

class IterableFib implements Iterable<Integer> {
	private Generator<Integer> gen ;
	private int n;

	IterableFib(int size){
		n = size;
		gen = new Fibonacci();
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>(){
			private int index = 0;
			@Override
			public boolean hasNext() {
				return index < n;
			}

			@Override
			public Integer next() {
				index++;
				return gen.next();
			}
			
		};
	}
	
}

public class Fibonacci implements Generator<Integer> {
  private int count = 0;
  public Integer next() { return fib(count++); }
  private int fib(int n) {
    if(n < 2) return 1;
    return fib(n-2) + fib(n-1);
  }

  public static void main(String[] args) {
    IterableFib fib = new IterableFib(18);
    for(Integer i: fib)
      System.out.print(i + " ");
  }
} /* Output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
*///:~
