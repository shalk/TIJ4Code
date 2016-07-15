package interfaces.solution.Ex7;

import static net.mindview.util.Print.*;
interface Rodent{
	public void smile();
}
class Mouse implements Rodent{
	Mouse() {
		print("Mouse init");
	}

	public void smile(){
		System.out.println("Mouse smile");
	}
}
class Gerbil implements Rodent{
	Gerbil() {
		print("Gerbil init");
	}
	public void smile(){
		System.out.println("Gerbil smile");
	}
}
class Hamster implements Rodent{
	Hamster() {
		print("Hamster init");
	}
	public void smile(){
		System.out.println("Hamster smile");
	}
}
class SharedMouse extends Mouse {
	private int refcount = 0;
	private static int count = 0;
	private final int id = count++;
	SharedMouse(){
		System.out.println("SharedMouse init");
	}
	void addRef(){
		refcount++;
	}
	protected void dispose(){
		if(--refcount == 0)
			System.out.println("disposing " + this);
	}
	public String toString(){
		return "SharedMouse: " + id;
	}
	
}
 class Ex1 {
	Rodent ro[] =  new Rodent[]{
			new Gerbil(),
			new Mouse(),
			new Hamster(),
		};
	SharedMouse shared;
	Ex1(SharedMouse shared){
		System.out.println("Ex9 init");
		this.shared = shared;
		this.shared.addRef();
	}
	public static void main(String[] args){
		SharedMouse sm = new SharedMouse();
		Ex1 ob1 = new Ex1(sm);
//		Ex1 ob2 = new Ex1(sm);
		System.out.println(ob1.shared);
//		System.out.println(ob2.shared);
		for(Rodent i : ob1.ro){
			i.smile();
		}
		
	}
}

public class Ex71 {
	public static void main(String[] args){
		SharedMouse sm = new SharedMouse();
		Ex1 ob1 = new Ex1(sm);
		for(Rodent i : ob1.ro){
			i.smile();
		}
		Ex1 ob2 = new Ex1(sm);
		System.out.println(ob1.shared);
		System.out.println(ob2.shared);
	}
}
