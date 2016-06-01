package initialization.solution;
class Tank {
	String state;
	Tank(){
		state = "empty";
	}
	void empty(){
		state = "empty";
	}
	void full(){
		state = "full";
	}
	protected void finalize(){
		if(state.equals("empty"))
			System.out.println("finalize");
	}
}
public class Ex12 {
	public static void main(String[] args){
		new Tank().empty();
		System.gc();
	}
}
