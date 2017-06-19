package generics.solution.ex18;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import generics.Generators;
import net.mindview.util.Generator;

class Fish {
	public static int count;
	public final int id = ++count;
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return this.getClass().getName() + " " + getId();
	}
}

class BigFish extends Fish {
	public static int count;
	public final int id = ++count;
	
	public int getId() {
		return id;
	}
	public static Generator<BigFish> generator(){
		return new Generator<BigFish>(){
			@Override
			public BigFish next() {
				return new BigFish();
			}
		};
	}
	
	public void eat(SmallFish s) {
		System.out.println(this + " eat " + s);
	}
}

class SmallFish extends Fish{
	public static int count;
	public final int id = ++count;
	
	public int getId() {
		return id;
	}
	public static Generator<SmallFish> generator(){
		return new Generator<SmallFish>(){
			@Override
			public SmallFish next() {
				return new SmallFish();
			}
		};
	}
}

public class Ex18 {
	public static void main(String[] args) {
		Random random = new Random(47);
		List<SmallFish> smallfishs = new ArrayList<SmallFish>();
		List<BigFish> bigfishs = new ArrayList<BigFish>();
		Generators.fill(smallfishs, SmallFish.generator(), 10);
		Generators.fill(bigfishs, BigFish.generator(), 10);
		for (Fish f: bigfishs) {
			System.out.println(f);
		}
		for (Fish f: smallfishs) {
			System.out.println(f);
		}

		for (SmallFish s: smallfishs) {
			bigfishs.get(random.nextInt(bigfishs.size())).eat(s);
		}

		System.out.println("BigFish count:" + BigFish.count);
		System.out.println("SmallFish count:" + SmallFish.count);
		System.out.println("Fish count:" + Fish.count);
	}
}
