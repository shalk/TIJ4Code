package strings.solution.ex20;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;

public class ex20 {
	public static BufferedReader br = new BufferedReader(
			new StringReader("nice to meet you\n 30 1000 10.333 300.1234"));
	String msg;
	int a;
	long b;
	float c;
	double d;

	ex20(String msg){
		this.msg = msg;
	}

	@Override
	public String toString(){
		return msg + " " + a + " " + b + " " + c + " " + d;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(br);
		ex20 obj = new ex20(s.nextLine());
		System.out.println(obj.toString());
		obj.a = s.nextInt();
		obj.b = s.nextLong();
		obj.c = s.nextFloat();
		obj.d = s.nextDouble();
		System.out.println(obj.toString());
	}

}
