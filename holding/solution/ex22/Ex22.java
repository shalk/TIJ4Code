package holding.solution.ex22;

import net.mindview.util.TextFile;
import java.util.*;

class Word {
	public String name;
	public int count;

	Word(String name){
		this.name = name;
		this.count = 1;
	}
	
	Word(String name, int count){
		this.name = name;
		this.count = count;
	}
	@Override
	public boolean equals(Object other){
		return this.name.equals(((Word)other).name);
	}
	
	@Override
	public String toString(){
		return name + ":" + count;
	}
}
public class Ex22 {
	public static void main(String[] args){
		List<String> words  = new ArrayList<String>();
		words.addAll(new TextFile("./holding/UniqueWords.java","\\W+"));
		Collections.sort(words,String.CASE_INSENSITIVE_ORDER);

		Set<Word> set = new HashSet<Word>();
		
		for(String word: words){
			Boolean newword = true;
			for(Word ob: set){
				if(ob.name.equals(word)){
					ob.count++;
					newword = false;
					break;
				}
			}
			if(newword){
				set.add(new Word(word,1));
			}
		}
		System.out.println(set);
	
	}
}
