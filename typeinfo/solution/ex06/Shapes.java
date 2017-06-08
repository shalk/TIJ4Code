//: typeinfo/Shapes.java
package typeinfo.solution.ex06; /* Added by Eclipse.py */
import java.util.*;

abstract class Shape {
	String flag;
	Shape(){
		if(this instanceof typeinfo.solution.ex06.Circle){
			this.flag = "Higliht";
		}else{
			this.flag = "unHight";
		}
	}
  void draw() { System.out.println(this + ".draw()"); }
  void rotate() {
	  try {
		if(!this.getClass().equals(Class.forName("typeinfo.solution.ex06.Circle"))){
			System.out.println(this + ".rotate()");  
		}
	} catch (ClassNotFoundException e) {
		System.out.println("Class Circle not found");
	}
  }
  abstract public String toString();
}

class Circle extends Shape {
  public String toString() { return "Circle " + this.flag; }
}

class Square extends Shape {
  public String toString() { return "Square " + this.flag; }
}

class Triangle extends Shape {
  public String toString() { return "Triangle " + this.flag; }
}	

public class Shapes {
  public static void main(String[] args) {
    List<Shape> shapeList = Arrays.asList(
      new Circle(), new Circle(), new Square(), new Triangle()
    );
    for(Shape shape : shapeList){
      System.out.println(shape);
    }
  }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
