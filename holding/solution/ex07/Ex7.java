package holding.solution.ex07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static net.mindview.util.Print.*;

public class Ex7 {
	private int x;
	private int y;

	Ex7(){}

	public Ex7(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString(){
		return "("+this.x + "," + this.y + ")";
	}
	
	public static void main(String[] args){
		List<Ex7> list = new ArrayList<Ex7>(Arrays.<Ex7>asList(new Ex7(1,2),new Ex7(3,4),new Ex7(5,6),new Ex7(7,4)));
		print(list);
		List<Ex7> sub = list.subList(2, 4);
		print(sub);
		list.removeAll(sub);
		print(list);
	}
}
