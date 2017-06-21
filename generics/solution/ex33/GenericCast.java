//: generics/GenericCast.java
package generics.solution.ex33; /* Added by Eclipse.py */

import java.util.ArrayList;

class FixedSizeStack <T> extends ArrayList<T> {

//	private Object[] storage;

	public void push(T item) {
		add(item);
	}

	public T pop() {
		return this.remove(this.size()-1);
	}
}

public class GenericCast {

	public static void main(String[] args) {
		FixedSizeStack<String> strings = new FixedSizeStack<String>();
		for (String s : "A B C D E F G H I J".split(" "))
			strings.push(s);
		int count = strings.size();
		for (int i = 0; i < count; i++) {
			String s = strings.pop();
			System.out.print(s + " ");
		}
	}
} /*
   * Output: J I H G F E D C B A
   */// :~
