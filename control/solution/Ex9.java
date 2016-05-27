package control.solution;

import static net.mindview.util.Print.*;
public class Ex9 {
	
	public static void fib(int num){
		int first = 1 ;
		int second = 1;
		
		if(num == 1){
			print(first);
			return;
		}
		
		if(num == 2){
			printnb(first + " ");
			print(second);
			return;
		}
		
		
		printnb(first + " ");
		printnb(second + " ");
		while(num > 2){
			int next = first + second;
			printnb(next + " ");
			first = second;
			second = next;
			num--;
		}
		print("");
	}
	public static void main(String[] args){
		if(args.length > 0){
			int num = Integer.parseInt(args[0]);
			fib(num);
		}
	}
}
