package generics.solution.ex03;
import net.mindview.util.FiveTuple;

public class SixTuple<A,B,C,D,E,F> extends FiveTuple<A,B,C,D,E>{
	private F sixth;
	public SixTuple(A a, B b, C c, D d, E e, F f) {
		super(a, b, c, d, e);
		this.sixth = f;
	}

	public String toString(){
		return "(" + first + "," + second + "," + third + "," +
				fourth + "," + fifth + "," + sixth + ")";
	}
	public static void main(String[] args) {
		SixTuple<String, Integer, Double, Boolean, String, Integer> sixtuple = 
				new SixTuple<String, Integer, Double, Boolean, String, Integer>("first", 10, 1.234, true, "fifth", 999);
		System.out.println(sixtuple);
	}
}
