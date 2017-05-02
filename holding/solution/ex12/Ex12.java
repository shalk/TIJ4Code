package holding.solution.ex12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Ex12 {
	public static void main(String[] args){
		List<Integer> list1 = Arrays.asList(323,2323,232,2,2,3,4,5);
		List<Integer> list2 = new ArrayList<Integer>();
		ListIterator<Integer> it = list1.listIterator(list1.size());
		while(it.hasPrevious()){
			list2.add(it.previous());
		}
		System.out.println(list1);
		System.out.print(list2);
		

	}

}
