//: innerclasses/Sequence.java
package holding.solution.ex09; /* Added by Eclipse.py */

import java.util.Iterator;

// Holds a sequence of Objects.

interface Selector {
  boolean end();
  Object current();
  void next();
}	

public class Sequence {
  private Object[] items;
  private int next = 0;
  public Sequence(int size) { items = new Object[size]; }
  public void add(Object x) {
    if(next < items.length)
      items[next++] = x;
  }

  private class SequenceSelector implements Iterator {
	private int i = 0;
	@Override
	public boolean hasNext() {
		return i != items.length;
	}

	@Override
	public Object next() {
		return items[i++];
	}
  }
  public Iterator selector() {
    return new SequenceSelector();
  }	
  public static void main(String[] args) {
    Sequence sequence = new Sequence(10);
    for(int i = 0; i < 10; i++)
      sequence.add(Integer.toString(i));
    Iterator it = sequence.selector();

    while(it.hasNext()) {
      System.out.print(it.next() + " ");
    }
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
