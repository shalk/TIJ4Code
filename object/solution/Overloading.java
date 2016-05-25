//: initialization/Overloading.java
package object.solution; /* Added by Eclipse.py */
// Demonstration of both constructor
// and ordinary method overloading.
import static net.mindview.util.Print.*;
/**
 * 这是一棵树啊
 * 可以查看树的高度
 * @author shalk
 * @version 1.0
 */
class Tree {
	/** 树的高度 */
  int height;
  /** 默认构造函数，高度为0
   */
  Tree() {
    print("Planting a seedling");
    height = 0;
  }
  /** 通过高度进行构造
   * 
   * @param initialHeight 树的初始高度
   */
  Tree(int initialHeight) {
    height = initialHeight;
    print("Creating new Tree that is " +
      height + " feet tall");
  }	
  /** 查看树的默认信息
   * @return 返回值为空
   */
  void info() {
    print("Tree is " + height + " feet tall");
  }
  /** 查看树的默认信息
   * 
   * @param s  信息前缀
   * @return  返回值为空
   */
  void info(String s) {
    print(s + ": Tree is " + height + " feet tall");
  }
}

public class Overloading {
  public static void main(String[] args) {
    for(int i = 0; i < 5; i++) {
      Tree t = new Tree(i);
      t.info();
      t.info("overloaded method");
    }
    // Overloaded constructor:
    new Tree();
  }	
} /* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
*///:~
