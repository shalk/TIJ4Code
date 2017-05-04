package holding.solution.ex19;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Ex19 {
	public static void main(String[] args){
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Nice");
		set1.add("Fuzzy");
		set1.add("Adidas");
		set1.add("Puma");
		set1.add("Jordan");
		set1.add("Kobe");
		System.out.println(set1);
		
		TreeSet<String> sortSet = new TreeSet<String>(set1);
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		for(String s: sortSet){
			System.out.print(" Add: " + s);
			set2.add(s);
		}
		System.out.println();
		System.out.println(set2);

	}
}
