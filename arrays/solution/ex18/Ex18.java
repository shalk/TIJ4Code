package arrays.solution.ex18;

import java.util.Arrays;

import net.mindview.util.Generator;

class BerylliumSphere {
	private static long counter;
	private final long id = counter++;

	public String toString() {
		return "Sphere " + id;
	}
}

class SphereGenerator implements Generator<BerylliumSphere> {

	@Override
	public BerylliumSphere next() {
		return new BerylliumSphere();
	}

}

public class Ex18 {

	public static void main(String[] args) {

		BerylliumSphere[] a = new BerylliumSphere[10];
//		a = Generated.array(a, new SphereGenerator());
		Arrays.fill(a, new BerylliumSphere());
		BerylliumSphere[] b = new BerylliumSphere[10];
		System.arraycopy(a, 0, b, 0, a.length);
		for (int i = 0 ; i < a.length; i++) {
			System.out.println(a[i] == b[i]);
		}
	}

}
