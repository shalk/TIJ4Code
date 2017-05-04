package holding.solution.ex25;
import java.util.*;
import net.mindview.util.TextFile;

public class Ex25 {

	public static void main(String[] args){
		ArrayList<String> words = new ArrayList<String>();
		words.addAll(new TextFile("./holding/UniqueWords.java","\\W+"));
		System.out.println(words);
		
		Map<String,ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		for(int i = 0; i < words.size(); i++){
			String word = words.get(i);
			ArrayList<Integer>value = map.get(word);
			if(value==null){
				value = new ArrayList<Integer>();
			}
			value.add(i);
			map.put(word, value);
		}
		System.out.println(map);
	}
}
