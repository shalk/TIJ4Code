package strings.solution.ex11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex11 {
	public static void main(String[] args){
		String msg = "Airline are eight apples and one orange while Anita hadn't any";
		String regex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(msg);
		while(m.find()){
			System.out.println("Match (" + m.group() + "): postion from " + m.start() + "-" + m.end());
		}
		
	}
}
