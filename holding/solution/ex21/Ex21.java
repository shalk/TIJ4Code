package holding.solution.ex21;
import net.mindview.util.TextFile;
import java.util.*;

public class Ex21 {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		words.addAll(new TextFile("./holding/UniqueWords.java","\\W+"));
		System.out.println(words);
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String word: words){
			if(map.containsKey(word)){
				map.put(word, map.get(word) + 1);
			}else{
				map.put(word,1);
			}
		}
		List<String> keys = new ArrayList<String>(map.keySet());
		System.out.println(keys);
		Collections.sort(keys,String.CASE_INSENSITIVE_ORDER);
		System.out.println(keys);
		for(String key: keys){
			System.out.println(key + ":" + map.get(key));
		}

	}

}
