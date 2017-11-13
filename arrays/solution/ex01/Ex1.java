package arrays.solution.ex01;

import java.util.*;
import static net.mindview.util.Print.*;

class Apple {
	private static int count  = 0;
	private int id = count++;

	Apple(){
	}
	
	Apple(int id){
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Apple " + id;
	}
}

public class Ex1 {
	
	public static void foo(Apple[] apps) {
		System.out.println(Arrays.toString(apps));
	}
	
	public static void main(String[] args) {
		// dynamic aggregate initialization
		Apple[] a = new Apple[]{ new Apple(), new Apple()};
		// aggregate initialization
		Apple[] b = {new Apple(), new Apple()};
		Apple[] c;
		c = new Apple[]{new Apple(), new Apple()};

		Apple[] d;
		// Error aggregate initialization can only be used in declare
//		d = {new Apple(), new Apple()};

		
		foo(a);
		foo(b);
		foo(c);
//		foo({new Apple(),new Apple()});
		// Anonymous array
		foo(new Apple[]{new Apple(),new Apple()});

	}
}
