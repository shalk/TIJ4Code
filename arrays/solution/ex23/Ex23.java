package arrays.solution.ex23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import net.mindview.util.Generated;
import net.mindview.util.Generator;

public class Ex23 {

	static class IntGen implements Generator<Integer> {

		private Random rand = new Random(47);

		@Override
		public Integer next() {
			return rand.nextInt(300);
		}

	}

	public static void main(String[] args) {
		Integer[] a1 = new Integer[10];
		Generated.array(a1, new Ex23.IntGen());
		System.out.println(Arrays.toString(a1));

		Arrays.sort(a1, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(Arrays.toString(a1));

		Integer[] a2 = new Integer[10];
		Generated.array(a2, new Ex23.IntGen());
		Arrays.sort(a2, (o1, o2) -> o1 > o2 ? -1 : o1 < o2 ? 1 : 0);
		System.out.println(Arrays.toString(a2));



	}

}
