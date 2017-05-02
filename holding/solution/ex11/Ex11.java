package holding.solution.ex11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Ex11 {
	public static void travel(Iterator<String> it){
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}
	public static Collection<String> fill(Collection<String> c){
		String[] data = {"this","is","collect","iterator"};
		Collections.addAll(c, data);
		return c;
	}

	
	public static void main(String[] args){
		travel(fill(new ArrayList<String>()).iterator());
		travel(fill(new LinkedList<String>()).iterator());
		travel(fill(new HashSet<String>()).iterator());
		travel(fill(new TreeSet<String>()).iterator());
		travel(fill(new LinkedHashSet<String>()).iterator());
	}
}
