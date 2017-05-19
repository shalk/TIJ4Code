package exceptions.solution.ex07;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.*;

public class Ex7 {
	private final static Logger logger = Logger.getLogger("Ex8");
	public static void logException(Exception e){
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		logger.severe(sw.toString());
		
	}
	public static void main(String[] args) {
		try {
			int[] intarrays = new int[3];
			intarrays[3] = 4;
		} catch(ArrayIndexOutOfBoundsException e){
			logException(e);
		}
	}

}
