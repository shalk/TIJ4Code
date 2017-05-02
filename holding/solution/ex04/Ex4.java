package holding.solution.ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Ex4 {
	List<String> movies = new ArrayList<String>();
	int length;
	{
		movies = Arrays.asList("Snow White", "Star Wars", "Ring");
		length = movies.size();
	}
	int i = 0;
	String next() {
		return movies.get(i++);
	}
	Boolean hasNext() {
		Boolean ret = (i != movies.size());
		if(i == movies.size())
			i = 0;
		return ret;
	}

	static Collection fill(Collection<String> c, Ex4 generater) {
		while (generater.hasNext()) {
			c.add(generater.next());
		}
		return c;
	}
	static String[] fill(String[] c, Ex4 generater) {
		return generater.movies.toArray(c);
	}	
	public static void main(String[] args){
		Ex4 gen = new Ex4();
//		System.out.println(fill(new String[3],gen));
		System.out.println(fill(new ArrayList<String>(),gen));
		System.out.println(fill(new LinkedList<String>(),gen));
		System.out.println(fill(new HashSet<String>(),gen));
		System.out.println(fill(new TreeSet<String>(),gen));
		System.out.println(fill(new LinkedHashSet<String>(),gen));
	}

}
