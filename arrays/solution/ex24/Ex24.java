package arrays.solution.ex24;

import java.util.Arrays;

class Node implements Comparable<Node>{
	private int val;

	Node() {
		val = 0;
	}

	Node(int val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return "Node [val=" + val + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Node that = (Node) o;
		return this.val == that.val;
	}

	@Override
	public int hashCode() {
		return val;
	}

	@Override
	public int compareTo(Node o) {
		if (this == o)
			return 0;
		if ( o == null)
			return 1;
		return this.val > o.val ? 1 : this.val < o.val ? -1 : 0;
	}

}

public class Ex24 {
	public static void main(String[] args) {
		Node[] a1 = new Node[]{ new Node(5), new Node(2), new Node(7), new Node(10)};
		System.out.println(Arrays.toString(a1));
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.binarySearch(a1, new Node(7)));
	
	}

}
