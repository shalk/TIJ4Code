package holding.solution.ex14;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex14 {
	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<Integer>();
		List<Integer> data = Arrays.asList(11,23,43,23,31,41);
		for(Integer i : data){
			ListIterator<Integer> it = list.listIterator(list.size()/2);
			it.add(i);
			System.out.println(list);
		}
	}
}
