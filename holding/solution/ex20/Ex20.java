package holding.solution.ex20;
import net.mindview.util.TextFile;
import java.util.*;

public class Ex20 {
	public static void main(String[] args){
		List<String> words = new ArrayList<String>();
		words.addAll(new TextFile("./holding/UniqueWords.java","\\W+"));
		System.out.println(words);
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		map.put('A', 0);
		map.put('E', 0);
		map.put('I', 0);
		map.put('O', 0);
		map.put('U', 0);
		map.put('a', 0);
		map.put('e', 0);
		map.put('i', 0);
		map.put('o', 0);
		map.put('u', 0);
		
		for(String word: words){
			for(int i = 0 ; i < word.length(); i++){
				Character ch = word.charAt(i);
				if(map.containsKey(ch)){
					map.put(ch,map.get(ch) + 1);
				}
			}
		}
		int sum = 0;
		for(Character ch: map.keySet()){
			System.out.println(ch + ":" + map.get(ch));
			sum += map.get(ch);
		}
		System.out.println("sum:" + sum);
	}
}
