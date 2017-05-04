package holding.solution.ex01;

import java.util.List;
import java.util.ArrayList;

public class Gerbill {
	public int id;
	public static int gerbillNumber;

	public Gerbill(){
		gerbillNumber = gerbillNumber + 1;
		id = gerbillNumber;
	}

	public void hop(){
		System.out.println("Gerbill No." + id + " is hopping");
	}

	public static void main(String[] args){
		List<Gerbill> gerbills = new ArrayList<Gerbill>();
		gerbills.add(new Gerbill());
		gerbills.add(new Gerbill());
		for( int i = 0; i < gerbills.size(); i++){
			gerbills.get(i).hop();
		}
	}
}
