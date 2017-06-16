package generics.solution.ex11;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import net.mindview.util.New;

class TestMap {
	static void test(){
		Map<String,Integer> map = New.map();
		map.put("aaa", 1);
		map.put("bbb", 2);
		map.put("ccc", 3);
		System.out.println(map);
	}
}

class TestList {
	static void test(){
		List<String> list = New.list();
		Collections.addAll(list, "first", "second");
		System.out.println(list);
	}
	
}

class TestLinkedList {
	static void test() {
		LinkedList<String> list = New.lList();
		list.add("first string");
		list.addFirst("append to first");
		System.out.println(list);
	}
}

class TestSet {
	static void test() {
		Set<String> set = New.set();
		set.addAll(Arrays.asList("aaa","aaa","bbb"));
		System.out.println(set);
	}
}

class TestQueue {
	public static void test() {
		Queue<String> queue = New.queue();
		queue.offer("queue 1");
		queue.offer("queue 2");
		queue.offer("queue 3");
		while(queue.peek() != null)
			System.out.println(queue.poll());
		
		queue.add("qe 1");
		queue.add("qe 2");
		queue.add("qe 3");
		try {
			while (queue.element() != null)
				System.out.println(queue.remove());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

public class Test {
	public static void main(String[] args){
		TestMap.test();
		TestList.test();
		TestLinkedList.test();
		TestSet.test();
		TestQueue.test();
	}
}
