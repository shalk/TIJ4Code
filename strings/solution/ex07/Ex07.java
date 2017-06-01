package strings.solution.ex07;
import java.util.regex.Pattern;
//import java.util.regex.Matcher;
public class Ex07 {
	public static void main(String[] args){
		String sentense = "A tale of two City".toLowerCase();
		Pattern p = Pattern.compile("^[A-Z].*");
		if(p.matcher(sentense).matches()){
			System.out.println("Start with UpperCase Letter");
		}else{
			System.out.println("Start with LowerCase Letter");
		}
		
		String s2 = "American Gods";
		System.out.println(s2.matches("^[A-Z].*"));
	}

}
