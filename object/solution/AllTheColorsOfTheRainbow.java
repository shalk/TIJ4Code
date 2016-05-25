package object.solution;

public class AllTheColorsOfTheRainbow {
	int anIntegerRepresentingColors;
	void changeTheHueOfTheColor(int newHue){
		anIntegerRepresentingColors = newHue;
	}
	public static void main(String[] args){
		AllTheColorsOfTheRainbow ob = new AllTheColorsOfTheRainbow();
		ob.changeTheHueOfTheColor(10);
		System.out.println(ob.anIntegerRepresentingColors);
	}
}
