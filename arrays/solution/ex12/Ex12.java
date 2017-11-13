package arrays.solution.ex12;


import java.util.Arrays;

import net.mindview.util.CountingGenerator;
import net.mindview.util.Generator;
public class Ex12 {
	
	public static void main(String[] args) {
		Generator<Double> g = new CountingGenerator.Double();
		double[] d = new double[10];
		for (int i = 0; i < d.length; i++) {
			d[i] = g.next();
		}
		
		System.out.println(Arrays.toString(d));
	}

}
