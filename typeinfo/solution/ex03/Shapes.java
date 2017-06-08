//: typeinfo/Shapes.java
package typeinfo.solution.ex03; /* Added by Eclipse.py */
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

class Rhomboid extends Shape {
	public String toString() { return "Rhomboid"; }
}
public class Shapes {
  public static void main(String[] args) {
    List<Shape> shapeList = Arrays.asList(
      new Circle(), new Square(), new Triangle(), new Rhomboid()
    );
    for(Shape shape : shapeList)
      shape.draw();
    Rhomboid r = new Rhomboid();
    Shape s = (Shape) r;
    Rhomboid r1 = (Rhomboid) s;
    Circle c = (Circle) s; // java.lang.ClassCastException
  }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
