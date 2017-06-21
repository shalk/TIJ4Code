package generics.solution.ex38;

import generics.coffee.*;
import static net.mindview.util.Print.*;

class Decorator extends Coffee{
	protected Coffee c;
	public Decorator(Coffee c) {
		this.c = c;
	}
}

class Milk extends Decorator {
	public Milk(Coffee c) {
		super(c);
		print("get a milk");
	}
	void foo1(){
		print("drink milk");
	}
}

class Chocolate extends Decorator {
	public Chocolate(Coffee c) {
		super(c);
		print("get a chocolate");
	}
	void foo2() {
		print("drink choco");
	}
}

public class Ex38 {
	public static void main(String[] args) {
		Milk milk = new Milk(new Coffee());
		milk.foo1();
		Chocolate choco = new Chocolate(new Milk(new Coffee()));
		choco.foo2();
	}
}
