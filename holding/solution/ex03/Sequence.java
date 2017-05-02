//: innerclasses/Sequence.java
package holding.solution.ex03; /* Added by Eclipse.py */

import java.util.ArrayList;
import java.util.List;

// Holds a sequence of Objects.

interface Selector {
  boolean end();
  Object current();
  void next();
}	

public class Sequence {
  private List<Object> items;
  public Sequence() { items = new ArrayList<Object>(); }
  public void add(Object x) {
	  items.add(x);
  }
  private class SequenceSelector implements Selector {
	 // 记录当前位置
	private int i = 0;
    public boolean end() { 
    	return i == items.size(); 
    }
    public Object current() { return items.get(i); }
    public void next() { if(i < items.size()) i++; }
  }
  
  public Selector selector() {
    return new SequenceSelector();
  }	
  public static void main(String[] args) {
    Sequence sequence = new Sequence();
    for(int i = 0; i < 50; i++)
      sequence.add(Integer.toString(i));
    Selector selector = sequence.selector();
    while(!selector.end()) {
      System.out.println(selector.current() + " ");
      selector.next();
    }
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
