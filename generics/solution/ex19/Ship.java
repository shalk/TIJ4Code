package generics.solution.ex19;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.mindview.util.Generator;

class Box {
	private static int count;
	public	final int id = ++count; 
	public static Random rand = new Random(47);
	double width;
	double length;
	double height;
	double weight;
	
	public Box(double w, double l, double h, double weight) {
		this.width = w;
		this.length = l;
		this.height = h;
		this.weight = weight;
	}
	
	public String toString() {
		return String.format("Box #%d: %.2e * %.2e * %.2e", id, width, length, height);
	}
	
	public static Generator<Box> generator() {
		return new Generator<Box>(){
			@Override
			public Box next() {
				return new Box(
						rand.nextDouble()+rand.nextInt(47),
						rand.nextDouble()+rand.nextInt(47),
						rand.nextDouble()+rand.nextInt(47),
						rand.nextDouble()+rand.nextInt(47)
						);
			}
		};
	}
}

class Room extends ArrayList<Box> {
	static int count;
	public final int id = ++count;

	Room(int boxn) {
		for (int i = 0; i < boxn; i++) {
			this.add(Box.generator().next());
		}
	}
}

class Staff {}

class Captain {}

public class Ship extends ArrayList<Room>{
	public Captain captain = new Captain();
	public List<Staff> staff = new ArrayList<Staff>();
	
	public Ship(int roomn, int boxn){
		for (int i = 0; i < roomn; i++) {
			add(new Room(boxn));
		}
	}

	public String toString(){
		StringBuffer result = new StringBuffer();
		for (Room r: this) {
			result.append("In Room #" + r.id + "\n");
			for (Box b: r) {
				result.append("\t");
				result.append(b);
				result.append("\n");
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		System.out.println(new Ship(3,3));
	}
}
