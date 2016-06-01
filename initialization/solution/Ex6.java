package initialization.solution;

class Dog1 {
	
	void barking(int t){
		for(int i = 0 ; i < t; i++)
			System.out.print("Barking!");
		System.out.println("");
	}
	void barking(char w){
		System.out.println("Barking:" + w + " " + w + " "+ w + "!");
	}
}

public class Ex6 {
	public static void main(String[] args){
		Dog1 a = new Dog1();
		char w = 'o';
		int times = 3;
		a.barking(3);
		a.barking(w);
		System.out.println("END");
	}
}
