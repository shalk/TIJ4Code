package strings.solution.ex19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

// first comment
// seconde comment 
// class xxxx {
public class ex19 {
	public static void main(String[] args){
/*		if(args.length != 1){
			System.out.println("Usage: prog file");
			System.exit(0);
		}
		String filename = args[0];
*/		
		String filename = "strings/solution/ex19/ex19.java";
		String regex = "class (\\w+) \\{";
		Matcher m = Pattern.compile(regex).matcher("");
		int index = 1;
		for(String line: new TextFile(filename)){
			m.reset(line);
			if(m.find()){
				System.out.println("line" + index++ + " : "+m.group(1));
			}
		}
	}
}
