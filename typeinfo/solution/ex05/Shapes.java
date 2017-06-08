//: typeinfo/Shapes.java
package typeinfo.solution.ex05; /* Added by Eclipse.py */
import java.util.*;

abstract class Shape {
  void draw() { System.out.println(this + ".draw()"); }
  void rotate() {
	  try {
		if(!this.getClass().equals(Class.forName("typeinfo.solution.ex05.Circle"))){
			System.out.println(this + ".rotate()");  
		}
	} catch (ClassNotFoundException e) {
		System.out.println("Class Circle not found");
	}
  }
  abstract public String toString();
}

class Circle extends Shape {
  public String toString() { return "Circle"; }
}

class Square extends Shape {
  public String toString() { return "Square"; }
}

class Triangle extends Shape {
  public String toString() { return "Triangle"; }
}	

public class Shapes {
  public static void main(String[] args) {
    List<Shape> shapeList = Arrays.asList(
      new Circle(), new Square(), new Triangle()
    );
    for(Shape shape : shapeList){
      shape.draw();
      shape.rotate();
    }
  }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
