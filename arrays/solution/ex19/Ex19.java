package arrays.solution.ex19;

import java.util.Arrays;

class Node {
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

}

public class Ex19 {
	public static void main(String[] args) {
		Node[] a1 = new Node[]{ new Node(2), new Node(5), new Node(7)};
		Node[] b1 = new Node[]{ new Node(2), new Node(5), new Node(7)};
		System.out.println(Arrays.equals(a1, b1));
	}

}
