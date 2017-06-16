package generics.solution.ex08;

import java.util.Iterator;
import java.util.Random;

import net.mindview.util.Generator;

class BadGuys extends StoryCharacters {}

class GoodGuys extends StoryCharacters {}

class StoryCharactersGen implements Generator<StoryCharacters>, Iterable<StoryCharacters>{
	
	private Class[] types = {
			BadGuys.class,GoodGuys.class
	};
	private int size = 0;

	private static Random random = new Random(47);

	public StoryCharactersGen(int size){
		this.size = size;
	}
	
	@Override
	public Iterator<StoryCharacters> iterator() {
		return new Iterator<StoryCharacters>(){
			private int index = 0;
			@Override
			public boolean hasNext() {
				return index < size;
			}

			@Override
			public StoryCharacters next() {
				index++;
				return StoryCharactersGen.this.next();
			}
			
		};
	}

	@Override
	public StoryCharacters next() {
		try {
			return (StoryCharacters)types[random.nextInt(types.length)].newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}

public class StoryCharacters {
	private static int count;
	private final int id = ++count;
	public String toString(){
		return this.getClass().getSimpleName() + ": " + id;
	}
	public static void main(String[] args) {
		StoryCharactersGen gen = new StoryCharactersGen(10);
		for(StoryCharacters c: gen){
			System.out.println(c);
		}
	}
}
