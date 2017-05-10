package holding.solution.ex28;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

public class Ex28 {
	public static void main(String[] args){
		PriorityQueue<Double> pqueue = new PriorityQueue<Double>();
		Random rand = new Random();
		for(int i = 0; i<10; i++){
			Double value = rand.nextInt(30) + rand.nextDouble();
			pqueue.offer(value);
		}
		System.out.println(pqueue);
		while(pqueue.peek() != null){
			System.out.print(pqueue.poll() + " ");
		}
		System.out.println();
		
	}
}
