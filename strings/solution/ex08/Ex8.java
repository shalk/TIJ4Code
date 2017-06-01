package strings.solution.ex08;

import java.util.Arrays;

public class Ex8 {
	  public static String knights =
			    "Then, when you have found the shrubbery, you must " +
			    "cut down the mightiest tree in the forest... " +
			    "with... a herring!";
	  public static void main(String[] args){
		  System.out.println(Arrays.toString(knights.split("the|you")));
	  }
}
