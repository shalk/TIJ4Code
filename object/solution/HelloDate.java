//: object/solution/HelloDate.java
package object.solution;
import java.util.*;
/** The first Thingking in Java example program.
 * Displays a string  and today's date
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */
public class HelloDate {
	/** Entry point to class and application.
	 * @param args array of string arguments
	 * @throws Exception No excetption thrown
	 */
	public static void main(String args[]) throws Exception{
		System.out.println("Hello. it's: ");
		System.out.println(new Date());
	}
} /* Output: (55% match)
Hello. its:
Wed May 25 16:44:32 CST 2016
*///:~