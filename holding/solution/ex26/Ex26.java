package holding.solution.ex26;

import java.util.*;
import net.mindview.util.TextFile;

public class Ex26 {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.addAll(new TextFile("./holding/UniqueWords.java", "\\W+"));
		System.out.println(words);

		Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		for (int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			ArrayList<Integer> value = map.get(word);
			if (value == null) {
				value = new ArrayList<Integer>();
			}
			value.add(i);
			map.put(word, value);
		}
		System.out.println(map);
		ArrayList<String> originwords = new ArrayList<String>();
		int sum = 0;
		for (String word : map.keySet()) {
			sum += map.get(word).size();
		}
		for (int i = 0; i < sum; i++) {
			String currentword = null;
			for (String word : map.keySet()) {
				ArrayList<Integer> posList = map.get(word);
				if(posList.size() == 0){
					continue;
				}
				if(posList.get(0) ==  i){
					i = posList.get(0);
					currentword = word;
					posList.remove(0);
					break;
				}
			}
			originwords.add(currentword);
		}
		System.out.println(originwords);
	}
}
