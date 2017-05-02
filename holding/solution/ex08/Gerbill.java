package holding.solution.ex08;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Gerbill {
	private static int count = 0;
	public final int id = ++count;

	public void hop(){
		System.out.println("Gerbill No." + id + " is hopping");
	}

	public static void main(String[] args){
		List<Gerbill> gerbills = new ArrayList<Gerbill>();
		gerbills.add(new Gerbill());
		gerbills.add(new Gerbill());
		gerbills.add(new Gerbill());
		gerbills.add(new Gerbill());
		gerbills.add(new Gerbill());
		gerbills.add(new Gerbill());
		Iterator<Gerbill> iter = gerbills.iterator();
		while(iter.hasNext()){
			iter.next().hop();
		}
	}
}
