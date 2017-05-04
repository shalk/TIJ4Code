package holding.solution.ex17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import holding.solution.ex01.Gerbill;
public class Ex17 {
	public static void main(String[] args){
		Gerbill g1 = new Gerbill();
		Map<String, Gerbill> map = new HashMap<String, Gerbill>();
		map.put("Fuzzy1", new Gerbill());
		map.put("Spot", new Gerbill());
		map.put("Fuzzy2", new Gerbill());
		map.put("Fuzzy3", new Gerbill());
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()){
			map.get(it.next()).hop();
		}
		
	}
}
