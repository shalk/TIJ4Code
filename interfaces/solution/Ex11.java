package interfaces.solution;
import interfaces.interfaceprocessor.*;

class FooProcessorAdapter implements Processor{
	private Ex11 foo ;
	FooProcessorAdapter(Ex11 foo){
		this.foo = foo;
	}
	
	public String name() {
		// TODO Auto-generated method stub
		return this.foo.toString();
	}

	public String process(Object input) {
		// TODO Auto-generated method stub
		return foo.process((String) input);
	}
	
}


public class Ex11 {
	public String toString(){
		return "Ex11 processor";
	}
	public String process(String s){
		String ret = new String("");
		for(int i = 0 ; i < s.length() ; i+=2 ){
			if(i + 1 < s.length()){
				ret = ret + s.charAt(i+1);
				ret = ret + s.charAt(i);
			}else{
				ret = ret + s.charAt(i);
			}
		}
		return ret;
	}
	public static void main(String[] args){
		String input = "abcd1";
		Ex11 foo = new Ex11();
		FooProcessorAdapter adapter = new FooProcessorAdapter(foo);
		Apply.process(adapter, input);
		
	}
}

