//: arrays/ContainerComparison.java
package arrays.solution.ex15; /* Added by Eclipse.py */

import java.util.*;

import net.mindview.util.Generated;
import net.mindview.util.Generator;

import static net.mindview.util.Print.*;

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

public class ContainerComparison {

	public static void main(String[] args) {
		
		BerylliumSphere[] a1 = new BerylliumSphere[10];
		a1 = Generated.array(a1, new SphereGenerator());
		print(Arrays.toString(a1));
		
		BerylliumSphere[] a2;
		a2 = Generated.array(BerylliumSphere.class, new SphereGenerator(), 5);
		print(Arrays.toString(a2));
	}
}  /* Output
[Sphere 0, Sphere 1, Sphere 2, Sphere 3, Sphere 4, Sphere 5, Sphere 6, Sphere 7, Sphere 8, Sphere 9]
[Sphere 10, Sphere 11, Sphere 12, Sphere 13, Sphere 14]
*///: ~