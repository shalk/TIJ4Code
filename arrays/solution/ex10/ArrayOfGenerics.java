//: arrays/ArrayOfGenerics.java
package arrays.solution.ex10; /* Added by Eclipse.py */
// It is possible to create arrays of generics.
import java.util.*;

public class ArrayOfGenerics {
  public static void main(String[] args) {
    List<List<String>> ls;
    List<List<String>> la = new ArrayList<>();
    ls = la; 
    ls.add(new ArrayList<String>());

    List<List<BerylliumSphere>> spheres = new ArrayList<>();
    for(int i = 0; i < 10; i++)
      spheres.add(new ArrayList<BerylliumSphere>());
  }
} ///:~
