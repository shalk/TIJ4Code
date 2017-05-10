//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package holding.solution.ex31;
import java.util.*;

//import polymorphism.Shapes;
import polymorphism.shape.Circle;
import polymorphism.shape.Rectangle;
import polymorphism.shape.Shape;
import polymorphism.shape.Square;
import polymorphism.shape.Triangle;

public class RandomShapeGenerator implements Iterable<Shape> {
  private Random rand = new Random(47);
  Shape[] shapes;

  RandomShapeGenerator(){
	  shapes = new Shape[10];
	  for(int i = 0; i < shapes.length; i ++){
		  shapes[i]  = this.next();
	  }
  }

  RandomShapeGenerator(Integer num){
	  if(num > 0){
		  shapes = new Shape[num];
	  }else{
		  shapes = new Shape[10];
	  }
	  for(int i = 0; i < shapes.length; i ++){
		  shapes[i]  = this.next();
	  }
  }
  public Shape next() {
    switch(rand.nextInt(4)) {
      default:
      case 0: return new Circle();
      case 1: return new Square();
      case 2: return new Triangle();
      case 3: return new Rectangle();
    }
  }
  public static void main(String[] args){
	  RandomShapeGenerator gen = new RandomShapeGenerator();
	  for(Shape a: gen){
		  a.draw();
	  }
	  
  }
@Override
public Iterator<Shape> iterator() {
	return new Iterator<Shape>(){
		int current = 0;
		@Override
		public boolean hasNext() {
			return current != shapes.length;
		}

		@Override
		public Shape next() {
			return shapes[current++];
		}
		
	};
}
} ///:~
