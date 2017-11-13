package arrays.solution.ex13;

import net.mindview.util.CountingGenerator;
import net.mindview.util.Generator;

public class Ex13 {
	public static void main(String[] args) {
		Generator<Character> gen = new CountingGenerator.Character();
		char[] chars = new char[10];
		for (int i = 0; i < 20; i++)
			gen.next();
		for (int i = 0; i < chars.length; i++) {
			chars[i] = gen.next();
		}
		// charArray to String
		String msg = new String(chars);
		System.out.println(msg);

		// String to char array
		chars = msg.toCharArray();
		System.out.println(chars);
	}

}
