//: strings/Receipt.java
package strings.solution.ex04; /* Added by Eclipse.py */
import java.util.*;

public class Receipt {
  private double total = 0;
  private final static int LEFT_WIDTH = 15;
  private final static int MID_WIDTH = 5;
  private final static int RIGHT_WIDTH = 10;
  private Formatter f = new Formatter(System.out);
  public void printTitle() {
    f.format("%-" + LEFT_WIDTH + "s %" + MID_WIDTH + "s %" + RIGHT_WIDTH + "s\n", "Item", "Qty", "Price");
    f.format("%-" + LEFT_WIDTH + "s %" + MID_WIDTH + "s %" + RIGHT_WIDTH + "s\n", "----", "---", "-----");
  }
  public void print(String name, int qty, double price) {
    f.format("%-" + LEFT_WIDTH + ".15s %" + MID_WIDTH + "d %" + RIGHT_WIDTH + ".2f\n", name, qty, price);
    total += price;
  }
  public void printTotal() {
    f.format("%-" + LEFT_WIDTH + "s %" + MID_WIDTH + "s %" + RIGHT_WIDTH + ".2f\n", "Tax", "", total*0.06);
    f.format("%-" + LEFT_WIDTH + "s %" + MID_WIDTH + "s %" + RIGHT_WIDTH + "s\n", "", "", "-----");
    f.format("%-" + LEFT_WIDTH + "s %" + MID_WIDTH + "s %" + RIGHT_WIDTH + ".2f\n", "Total", "",
      total * 1.06);
  }
  public static void main(String[] args) {
    Receipt receipt = new Receipt();
    receipt.printTitle();
    receipt.print("Jack's Magic Beans", 4, 4.25);
    receipt.print("Princess Peas", 3, 5.1);
    receipt.print("Three Bears Porridge", 1, 14.29);
    receipt.printTotal();
  }
} /* Output:
Item              Qty      Price
----              ---      -----
Jack's Magic Be     4       4.25
Princess Peas       3       5.10
Three Bears Por     1      14.29
Tax                         1.42
                           -----
Total                      25.06
*///:~
