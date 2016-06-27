package polymorphism.solution;
import static net.mindview.util.Print.*;
class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}
	Glyph() {
		print("Glyph() before draw()");
		draw();
		print("Glyph() after draw()");
	}
}
class RectangularGlyph extends Glyph {
	private int length = 3;
	private int width = 4;
	RectangularGlyph(int l , int w){
		length = l;
		width = w;
		print("width: " + width);
		print("length: " + length);
	}
	@Override
	void draw(){
		print("RectangularGlyph draw() ");
		print("width: " + width);
		print("length: " + length);
	}
}
public class Ex15 {
	public static void main(String[] args){
		new RectangularGlyph(4, 5);
	}
}
