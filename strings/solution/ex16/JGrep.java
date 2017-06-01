//: strings/JGrep.java
package strings.solution.ex16; /* Added by Eclipse.py */

import java.io.File;
import java.util.ArrayList;

// f

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// A very simple version of the "grep" program.
// {Args: JGrep.java "\\b[Ssct]\\w+"}
import java.util.regex.*;
import net.mindview.util.*;

public class JGrep {
	public static List<File> get_files(File dirname){
		List<File> ret = new ArrayList<File>();
		if(dirname.isFile()){
			ret.add(dirname);
			return ret;
		}
		for(File f : dirname.listFiles()){
			ret.addAll(get_files(f));
		}
		return ret;
	}
	public static void main(String[] args) throws Exception {
		if (args.length < 2) {
			System.out.println("Usage: java JGrep file|dir regex");
			System.exit(0);
		}
		String filename;
		String regex = null;
		System.out.println(Arrays.toString(args));
		filename = args[0];
		regex = args[1];

		List<File> files = get_files(new File(filename));

		for(File file: files){
			System.out.println("filename: "+file);
			Pattern p = Pattern.compile(regex);
			// Iterate through the lines of the input file:
			int index = 0;
			Matcher m = p.matcher("");
			for (String line : new TextFile(file.toString())) {
				m.reset(line);
				while (m.find())
					System.out.println(index++ + ": " + m.group() + ": " + m.start());
			}
		}
	
	}
} /*
   * Output: (Sample) 0: strings: 4 1: simple: 10 2: the: 28 3: Ssct: 26 4:
   * class: 7 5: static: 9 6: String: 26 7: throws: 41 8: System: 6 9: System: 6
   * 10: compile: 24 11: through: 15 12: the: 23 13: the: 36 14: String: 8 15:
   * System: 8 16: start: 31
   */// :~
