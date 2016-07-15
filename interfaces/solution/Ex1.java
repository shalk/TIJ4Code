package interfaces.solution;
import static net.mindview.util.Print.*;
abstract class Rodent{
//	Rodent() {
//		print("Rodent init");
//	}
	abstract public void smile();
//		System.out.println("Rodent simle");
//	}
}
class Mouse extends Rodent{
	Mouse() {
		print("Mouse init");
	}
	@Override
	public void smile(){
		System.out.println("Mouse smile");
	}
}
class Gerbil extends Rodent{
	Gerbil() {
		print("Gerbil init");
	}
	@Override
	public void smile(){
		System.out.println("Gerbil smile");
	}
}
class Hamster extends Rodent{
	Hamster() {
		print("Hamster init");
	}
	@Override
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
public class Ex1 {
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
