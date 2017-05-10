package holding.solution.ex27;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Command{
	private String cmd;
	Command(String cmd){
		this.cmd = cmd;
	}
	public void operation(){
		System.out.println("Operation:" + cmd);
	}
}
class CommandQueue{
	public Queue<Command> fill(){
		Queue<Command> cQueue = new LinkedList<Command>();
		cQueue.offer(new Command("ps"));
		cQueue.offer(new Command("top"));
		cQueue.offer(new Command("ls -l"));
		cQueue.offer(new Command("who"));
		return cQueue;
	}
}
class CommandConsumer{
	public void consume(Queue<Command> queue){
		while(!queue.isEmpty()){
			queue.poll().operation();
		}
		
	}
}
public class Ex27 {
	public static void main(String[] args){
		new CommandConsumer().consume(new CommandQueue().fill());
	}
}
