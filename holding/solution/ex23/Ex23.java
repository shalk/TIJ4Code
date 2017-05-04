package holding.solution.ex23;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Ex23 {
	public static void test(){
		Random rand = new Random();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i< 100000; i++){
			Integer num = rand.nextInt(10);
			Integer key = map.get(num);
			if(key==null){
				map.put(num, 1);
			}else{
				map.put(num,key + 1);
			}
		}
//		System.out.println(map);
		Integer mostkey = null;
		Integer mostvalue = null;
		for(Integer key: map.keySet()){
			if(mostvalue == null){
				mostkey = key;
				mostvalue = map.get(key);
			}else if (map.get(key) > mostvalue){
				mostvalue = map.get(key);
				mostkey = key;
			}
		}
		System.out.println("Most count key:" + mostkey + ",value:" + mostvalue);
	}
	public static void main(String[] args){
		for(int i = 0 ; i < 10; i++){
			Ex23.test();
		}
	}
}
