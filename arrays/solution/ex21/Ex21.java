package arrays.solution.ex21;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import net.mindview.util.Generated;
import net.mindview.util.Generator;

class BerylliumSphere {
	private static long counter;
	private final long id = counter++;

	public String toString() {
		return "Sphere " + id;
	}

	public long getId() {
		return id;
	}
}

class SphereGenerator implements Generator<BerylliumSphere> {

	@Override
	public BerylliumSphere next() {
		return new BerylliumSphere();
	}

}

class BeryliumSphereComparator implements Comparator<BerylliumSphere> {

	@Override
	public int compare(BerylliumSphere o1, BerylliumSphere o2) {
		if (o1 == o2) {
			return 0;
		}

		if (o1 == null) {
			return -1;
		}

		if (o2 == null) {
			return 1;
		}

		return o1.getId() > o2.getId() ? 1 : o1.getId() < o2.getId() ? -1 : 0;

	}

}

// reverse
class BeryliumSphereComparator1 implements Comparator<BerylliumSphere> {

	@Override
	public int compare(BerylliumSphere o1, BerylliumSphere o2) {
		if (o1 == o2) {
			return 0;
		}

		if (o1 == null) {
			return 1;
		}

		if (o2 == null) {
			return -1;
		}

		return o1.getId() > o2.getId() ? -1 : o1.getId() < o2.getId() ? 1 : 0;

	}

}
public class Ex21 {

	public static void main(String[] args) {

		BerylliumSphere[] a = new BerylliumSphere[10];
		a = Generated.array(a, new SphereGenerator());
		a[9] = null;

		System.out.println(Arrays.toString(a));
		Arrays.sort(a, new BeryliumSphereComparator() );
		System.out.println(Arrays.toString(a));
		Arrays.sort(a, new BeryliumSphereComparator1() );
		System.out.println(Arrays.toString(a));

	}

}
