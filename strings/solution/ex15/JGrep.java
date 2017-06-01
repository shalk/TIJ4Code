//: strings/JGrep.java
package strings.solution.ex15; /* Added by Eclipse.py */
// f
import java.util.Arrays;
// A very simple version of the "grep" program.
// {Args: JGrep.java "\\b[Ssct]\\w+"}
import java.util.regex.*;
import net.mindview.util.*;

public class JGrep {
  public static void main(String[] args) throws Exception {
    if(args.length < 2) {
      System.out.println("Usage: java JGrep [-i -m]  file regex");
      System.exit(0);
    }
    int pattern_mode = -1;
    String filename;
    String regex = null;
    System.out.println(Arrays.toString(args));
    if(args.length == 4){
    	pattern_mode = Pattern.CASE_INSENSITIVE | Pattern.MULTILINE;
    	filename = args[2];
    	regex = args[3];
    }else if(args.length == 3){
    	if(args[0] == "-i") 
    		pattern_mode = 	Pattern.CASE_INSENSITIVE;
    	if(args[0] == "-m") 
    		pattern_mode = 	Pattern.MULTILINE;
    	filename = args[1];
    	regex = args[2];
    }else{
    	filename = args[0];
    	regex = args[1];
    }

    Pattern p = null ;
    if(pattern_mode == -1){
    	p = Pattern.compile(regex);
    }else {
    	p = Pattern.compile(regex,pattern_mode);
    }
    
    // Iterate through the lines of the input file:
    int index = 0;
    Matcher m = p.matcher("");
    for(String line : new TextFile(filename)) {
      m.reset(line);
      while(m.find())
        System.out.println(index++ + ": " +
          m.group() + ": " + m.start());
    }
  }
} /* Output: (Sample)
0: strings: 4
1: simple: 10
2: the: 28
3: Ssct: 26
4: class: 7
5: static: 9
6: String: 26
7: throws: 41
8: System: 6
9: System: 6
10: compile: 24
11: through: 15
12: the: 23
13: the: 36
14: String: 8
15: System: 8
16: start: 31
*///:~
