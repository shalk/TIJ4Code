//: typeinfo/Shapes.java
package typeinfo.solution.ex04; /* Added by Eclipse.py */
import java.util.*;

abstract class Shape {
  void draw() { System.out.println(this + ".draw()"); }
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
    for(Shape shape : shapeList)
      shape.draw();
    Triangle triangle = new Triangle();
    Shape s = (Shape) triangle;
    Circle c;
    if( s instanceof Circle){
    	c = (Circle) s;
    }
    if( Circle.class.isInstance(s))
    	c = (Circle) s;

    if(s.getClass().equals(Circle.class)){
    	c = (Circle) s;
    }
    
  }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
