package generics.solution.ex02;

public class Holder<T> {
	private T a;
	private T b;
	private T c;
	public T getA() {
		return a;
	}
	public void setA(T a) {
		this.a = a;
	}
	public T getB() {
		return b;
	}
	public void setB(T b) {
		this.b = b;
	}
	public T getC() {
		return c;
	}
	public void setC(T c) {
		this.c = c;
	}
	public Holder(T a, T b, T c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public static void main(String[] args) {
		Holder<String> h = new Holder<String>("first","second string","last string");
		System.out.println(h.getA());
		System.out.println(h.getB());
		System.out.println(h.getC());
	}
	
}
