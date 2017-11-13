package arrays.solution.ex09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex9 {
	
	public static void main(String[] args) {
//		Peel<Banana>[] peels1 = new Peel<Banana>[10];
		List<Peel<Banana>> peels2 = new ArrayList<>();
		peels2.add(new Peel<Banana>(new Banana()));
		peels2.add(new Peel<Banana>(new Banana()));
		peels2.add(new Peel<Banana>(new Banana()));
		peels2.add(new Peel<Banana>(new Banana()));
		System.out.println(peels2);
	}

}
