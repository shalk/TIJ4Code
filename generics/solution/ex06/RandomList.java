//: generics/RandomList.java
package generics.solution.ex06; /* Added by Eclipse.py */
import java.util.*;

public class RandomList<T> {
  private ArrayList<T> storage = new ArrayList<T>();
  private Random rand = new Random(47);
  public void add(T item) { storage.add(item); }
  public T select() {
    return storage.get(rand.nextInt(storage.size()));
  }
  public static void main(String[] args) {
    RandomList<String> rs = new RandomList<String>();
    for(String s: ("The quick brown fox jumped over " +
        "the lazy brown dog").split(" "))
      rs.add(s);
    for(int i = 0; i < 11; i++)
      System.out.print(rs.select() + " ");
    System.out.println();
    RandomList<Integer> rs1 = new RandomList<Integer>();
    for(Integer i: new int[]{1,2,3,4,5}){
    	rs1.add(i);
    }
    for(int i = 0 ; i < 11; i++)
    	System.out.print(rs1.select() + " ");
    System.out.println();

    RandomList<Double> rs2 = new RandomList<Double>();
    for(Double i: new double[]{1.2,2.3,3.4,4.4,5.6}){
    	rs2.add(i);
    }
    for(int i = 0 ; i < 11; i++)
    	System.out.print(rs2.select() + " ");
  }
} /* Output:
brown over fox quick quick dog brown The brown lazy brown
*///:~
