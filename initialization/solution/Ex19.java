package initialization.solution;

public class Ex19 {
	void foo(String...a){
		for(String s : a){
			System.out.println(s);
		}
		System.out.println("foo end");
	}
	public static void main(String[] args){
		Ex19 ob = new Ex19();
		String list = "a,b,c,d";
		ob.foo(list);
		String[] what = new String[]{"what", "is","that"};
		ob.foo(what);
	}
}
