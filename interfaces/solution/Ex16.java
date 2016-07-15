package interfaces.solution;
import java.util.*;
import java.io.IOException;
import java.nio.*;
class RandomChar {
	private static Random rand = new Random(47);
	private static char[] ab = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	int length = 10;
	RandomChar(){
		System.out.println("random char init");
	}
	String next(){
		String ret = "";
		for(int i = 0 ; i < length ;i++){
			ret = ret + ab[rand.nextInt(26)];
		}
//		System.out.println(ret);
		return ret;
	}
	public static void main(String[] args){
		RandomChar ob = new RandomChar();
		ob.next();
		ob.next();
	}
}
class RandomCharAdapter extends RandomChar implements Readable {
	private int count ;
	RandomCharAdapter(int count) {
		this.count = count;
	}

	public int read(CharBuffer cb)  {
		// TODO Auto-generated method stub
		if(count-- == 0){
			return -1;
		}
		String result = next() + " ";
		cb.append(result);
		return result.length();
	}
	
}

public class Ex16 {
	public static void main(String[] args){
		Scanner s = new Scanner(new RandomCharAdapter(10));
		while(s.hasNext()){
			System.out.println(s.next());
		}
	}
}
