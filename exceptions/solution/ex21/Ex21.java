package exceptions.solution.ex21;

class Base {
	Base() throws Exception {
		throw new Exception("test1");
	}
}
class Book extends Base {
	Book() throws Exception {
		try{
//			super(); //super Constructor should be first line
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

public class Ex21 {

	public static void main(String[] args){
		try {
			Book b1 = new Book();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}