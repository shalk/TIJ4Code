package interfaces.solution;
interface Cycle {
	void ride();
	void count();
}
interface CycleFactory{
	Cycle getCycle();
}

class Unicycle implements Cycle {
	public void ride(){
		System.out.println("ride Unicycle");
	}
	public void count(){
		
	}
}
class Bicycle implements Cycle {
	public void ride(){
		System.out.println("ride Bicycle");
	}
	public void count(){
		
	}
}
class Tricycle implements Cycle {
	public void ride(){
		System.out.println("ride Tricycle");
	}
	public void count(){
		
	}
}
class UniCycleFactory implements CycleFactory {
	public Unicycle getCycle(){
		return new Unicycle();
	}
}
class BiCycleFactory implements CycleFactory {
	public Bicycle getCycle(){
		return new Bicycle();
	}
}
class TriCycleFactory implements CycleFactory {
	public Tricycle getCycle(){
		return new Tricycle();
	}
}

public class Ex18 {
	public static void playCycle(CycleFactory cf){
		Cycle c = cf.getCycle();
		c.ride();
	}
	public static void main(String[] args){
		Ex18.playCycle(new UniCycleFactory());
		Ex18.playCycle(new BiCycleFactory());
		Ex18.playCycle(new TriCycleFactory());
	}
}
