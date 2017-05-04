package holding.solution.ex15;
import net.mindview.util.Stack;
public class MyStack {

	public static void main(String[] args){
		String message="+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
		Stack<Character> s = new Stack<Character>();
		for (int i = 0 ; i < message.length(); i++){
			Character ch = message.charAt(i);
			if(ch.equals('+')){
				i += 1;
				Character ch1 = message.charAt(i);
				s.push(ch1);
			}else if(ch.equals('-')){
				Character ch1 = s.pop();
				System.out.print(ch1);
			}else{
				System.out.println("unexpection");
			}
		}
	}
}
