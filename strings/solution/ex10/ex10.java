package strings.solution.ex10;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex10 {

	public static void main(String[] args) {
		String msg ="Java now has regular expressions";
		String[] regexs = new String[] {
				"^Java",
				"\\Breg.*",
				"n.w\\s+h(a|i)s",
				"s?",
				"s*",
				"s+",
				"s{4}",
				"s{1}.",
				"s{0,3}"
				};
		for(String regex: regexs){
			Matcher m = Pattern.compile(regex).matcher(msg);

			System.out.println("regex:" + regex);
			while(m.find()){
				System.out.println("match: (" + m.group() + ") at position " + m.start() + "-" + m.end());
			}
		}
	}

}
