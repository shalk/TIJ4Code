//: control/IfElse.java
package control.solution; /* Added by Eclipse.py */
import static net.mindview.util.Print.*;

public class Ex6 {
//  static int result = 0;
  static int test(int testval, int begin, int end) {
    if(testval < begin)
      return  -1;
    else if(testval > end)
      return +1;
    else
      return  0; // Match
  }
  public static void main(String[] args) {
		print(test(5, 2, 4));
		print(test(5, 6, 10));
		print(test(5, 3, 6));
  }
} /* Output:
1
-1
0
*///:~
