package holding.solution.ex24;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.TreeSet;

public class Ex24 {

	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("Source", "ิดย๋");
		map.put("Refactor", "chongou");
		map.put("Search", "shousuo");
		map.put("Project", "gongcheng");
		System.out.println(map);
		TreeSet<String> keySet = new TreeSet<String>(map.keySet());
		LinkedList<String> valueList = new LinkedList<String>();
		for(String key: keySet){
			valueList.add(map.get(key));
		}
		map.clear();
		
		Iterator<String> it1 = keySet.iterator();
		Iterator<String> it2 = valueList.iterator();
		while(it1.hasNext()){
			map.put(it1.next(),it2.next());
		}
		System.out.println(map);
	}

}
