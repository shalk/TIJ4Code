package initialization.solution;
class Dog {
	
	void barking(int t){
		for(int i = 0 ; i < t; i++)
			System.out.print("Barking!");
		System.out.println("");
	}
	void barking(char w){
		System.out.println("Barking:" + w + " " + w + " "+ w + "!");
	}
}

public class Ex5 {
	public static void main(String[] args){
		Dog a = new Dog();
		char w = 'o';
		int times = 3;
		a.barking(w);
		a.barking(3);
		System.out.println("END");
	}
}
