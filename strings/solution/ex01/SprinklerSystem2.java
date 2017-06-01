//: reusing/SprinklerSystem.java
package strings.solution.ex01; /* Added by Eclipse.py */
// Composition for code reuse.

class WaterSource1 {
  private String s;
  WaterSource1() {
    System.out.println("WaterSource()");
    s = "Constructed";
  }
  public String toString() { return s; }
}	

public class SprinklerSystem2 {
  private String valve1, valve2, valve3, valve4;
  private WaterSource1 source = new WaterSource1();
  private int i;
  private float f;
  public String toString() {
	  StringBuilder build = new StringBuilder();
	  build.append("valve1 = ");
	  build.append(valve1);
	  build.append(" ");
	  build.append("valve2 = ");
	  build.append(valve2);
	  build.append(" ");
	  build.append("valve3 = ");
	  build.append(valve3);
	  build.append(" ");
	  build.append("valve4 = ");
	  build.append(valve4);
	  build.append("\n");
	  build.append("i = ");
	  build.append(i);
	  build.append(" ");
	  build.append("f = ");
	  build.append(f);
	  build.append(" ");
	  build.append("source = ");
	  build.append(source);

	  return build.toString();
  }	
  public static void main(String[] args) {
    SprinklerSystem2 sprinklers = new SprinklerSystem2();
    System.out.println(sprinklers);
  }
} /* Output:
WaterSource()
valve1 = null valve2 = null valve3 = null valve4 = null
i = 0 f = 0.0 source = Constructed
*///:~
