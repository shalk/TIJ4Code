package initialization.solution;
class Ex10a{
	String s;
	protected void finalize(){
		System.out.println("finalize");
	}
}
public class Ex10 {
	public static void main(String[] args){
		for(int i = 0 ; i < 1000; i++)
			new Ex10a();
		System.gc();
	}
}
