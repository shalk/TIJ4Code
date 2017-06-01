package strings.solution.ex06;

public class Ex6 {
	int i = 10;
	long l = 100;
	float f = 10.3333f;
	double d = 10.123;
	public String toString(){
		return String.format("i = %d ,l = %d , f = %.2f ,d= %.2f", i,l,f,d);
	}
	public static void main(String[] args){
		Ex6 ex6 = new Ex6();
		System.out.println(ex6);
	}
	
}
