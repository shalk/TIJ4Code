package arrays.solution.ex17;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;

import net.mindview.util.Generated;
import net.mindview.util.Generator;

class BigDecimalGen implements Generator<BigDecimal> {

	private Random random = new Random(47);
	@Override
	public BigDecimal next() {
		return new BigDecimal(random.nextInt(1000) + random.nextDouble()) ;
	}
	
}

public class Ex17 {
	public static void main(String[] args) {
		BigDecimal[] a = new BigDecimal[10];
		a = Generated.array(a, new BigDecimalGen());
		System.out.println(Arrays.toString(a));
	}

}
