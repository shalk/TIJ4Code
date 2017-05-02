package holding.solution.ex10;
import static net.mindview.util.Print.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
class Rodent{
	Rodent() {
		print("Rodent init");
	}
	public void smile(){
		System.out.println("Rodent simle");
	}
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

public class Ex10 {
	public static Rodent ro[] =  new Rodent[]{
			new Gerbil(),
			new Mouse(),
			new Hamster(),
		};

	public static void main(String[] args){

		List<Rodent> rodents = new ArrayList<Rodent>(Arrays.asList(ro));
		Iterator<Rodent> it = rodents.iterator();
		while(it.hasNext()){
			it.next().smile();
		}
		
	}
}
