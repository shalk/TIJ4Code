package holding.solution.ex16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.mindview.util.TextFile;

public class Ex16 {
	public static void main(String[] args){
		List<String> words= new ArrayList<String>();
		words.addAll(new TextFile("holding/UniqueWords.java","\\W+"));
		System.out.println(words);
		Set<Character> vol = new HashSet<Character>();
		vol.addAll(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
		int sum = 0;
		for(String word: words){
			int num = 0;
			for(int i = 0 ; i < word.length(); i++){
				if(vol.contains(word.charAt(i))){
					num++;
				}
			}
			sum += num;
			System.out.println(word + ":" + num);
		}
		System.out.println("all vol:" + sum);
	}
}
