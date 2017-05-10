package holding.solution.ex29;

import java.util.PriorityQueue;

class TestEx29 extends Object {
	
}
public class Ex29 {
	public static void main(String[] args) {
		PriorityQueue<TestEx29> pQueue = new PriorityQueue<TestEx29>();
		pQueue.offer(new TestEx29()); // Exception TestEx29 cannot be cast to Comparable
		pQueue.offer(new TestEx29());
		pQueue.offer(new TestEx29());
		pQueue.offer(new TestEx29());
	}

}
