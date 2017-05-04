package holding.solution.ex18;
import java.util.*;

public class Ex18 {

	public static void main(String[] args) {


		HashMap<String,String> map1 = new HashMap<String, String>();
		map1.put("Fuzzy", "usa");
		map1.put("Spot","cctv");
		map1.put("Csdsd","bbc");
		map1.put("Best", "usa");
		map1.put("Abb","cctv");
		map1.put("Dash","bbc");
//		for(String s: map1.keySet()){
//			System.out.println("key:" + s + ", hashcode:" + s.hashCode());
//			System.out.println("value:" + map1.get(s) + ", hashcode:" + map1.get(s).hashCode());
//		}
		System.out.println(map1);
		LinkedHashMap<String,String> map2 = new LinkedHashMap<String, String>();
		TreeSet<String> keys = new TreeSet<String>(map1.keySet());
		System.out.println(keys);
		for(String s:  keys){
			System.out.print(" ADD: " + s);
			map2.put(s, map1.get(s));
		}
		System.out.println();
//		for(String s: map2.keySet()){
//			System.out.println("key:" + s + ", hashcode:" + s.hashCode());
//			System.out.println("value:" + map2.get(s) + ", hashcode:" + map2.get(s).hashCode());
//		}
		System.out.println(map2);
		

	}

}
