package polymorphism.shape;
import static net.mindview.util.Print.*;
public class Rectangle extends Shape {
	@Override
	public void erase(){
		print("Rectangle.earse()");
	}
	@Override
	public void draw(){
		print("Rectangle.draw()");
	}
	@Override
	public void show(){
		print("Rectangle.show()");
	}
}
