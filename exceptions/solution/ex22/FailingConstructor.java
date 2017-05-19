package exceptions.solution.ex22;

public class FailingConstructor {
	FailingConstructor() throws Exception {
		throw new Exception(" constructor fail");
	}
	public static void main(String[] args){
		try {
			FailingConstructor f = new FailingConstructor();
			// do sth
		} catch (Exception e) {
			
		}
		
	}
}
