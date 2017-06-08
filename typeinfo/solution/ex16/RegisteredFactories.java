package typeinfo.solution.ex16;

public class RegisteredFactories {

	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++){
			System.out.println(Coffee.randomCoffee());
		}
	}

}
