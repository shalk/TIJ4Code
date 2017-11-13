package arrays.solution.ex20;

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

public class Ex20 {

	public static void main(String[] args) {
		Node[][] a1 = new Node[][]{ {new Node(2), new Node(2)}, {new Node(3), new Node(4)}};
		Node[][] b1 = new Node[][]{ {new Node(2), new Node(2)}, {new Node(3), new Node(4)}};
		System.out.println("Node[][] arrays.equals:" + Arrays.equals(a1, b1));
		System.out.println("Node[][] arrays.deepEquals:" + Arrays.deepEquals(a1, b1));
	}
}
