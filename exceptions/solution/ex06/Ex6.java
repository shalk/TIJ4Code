package exceptions.solution.ex06;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.*;

class MyException1 extends Exception{
	private final static Logger logger = Logger.getLogger("MyException1");
	MyException1(){
		super();
		StringWriter writer = new StringWriter();
		this.printStackTrace(new PrintWriter(writer));
		logger.severe(writer.toString());
	}
	MyException1(String msg){
		super(msg);
		StringWriter writer = new StringWriter();
		this.printStackTrace(new PrintWriter(writer));
		logger.severe(writer.toString());
	}
}
class MyException2 extends Exception{
	private final static Logger logger = Logger.getLogger("MyException2");
	MyException2(){
		super();
		StringWriter writer = new StringWriter();
		this.printStackTrace(new PrintWriter(writer));
		logger.severe(writer.toString());
	}
	MyException2(String msg){
		super(msg);
		StringWriter writer = new StringWriter();
		this.printStackTrace(new PrintWriter(writer));
		logger.severe(writer.toString());
	}
}
public class Ex6 {

	public static void main(String[] args) {
		try{
			throw new MyException1("except 1");
		}catch(MyException1 e){
			
		}
		try{
			throw new MyException2("except 2");
		}catch(MyException2 e){
			
		}

	}

}
