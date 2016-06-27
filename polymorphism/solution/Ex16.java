package polymorphism.solution;
class AlertStatus {
	void color() {
		
	}
}
class RedAlert extends AlertStatus{
	void color() {
		System.out.println("Red");
	}
}
class GreenAlert extends AlertStatus{
	void color() {
		System.out.println("Green");
	}
}
class YellowAlert extends AlertStatus{
	void color() {
		System.out.println("Yellow");
	}
}
class Starship {
	AlertStatus as = new GreenAlert();
	void changeGreen(){
		as = new GreenAlert();
	}
	void changeRed(){
		as = new RedAlert();
	}
	void changeYellow(){
		as = new YellowAlert();
	}
	void showAlert(){
		as.color();
	}
}
public class Ex16 {
	public static void main(String[] args){
		Starship starship = new Starship();
		starship.showAlert();
		starship.changeYellow();
		starship.showAlert();
		starship.changeRed();
		starship.showAlert();
		starship.changeGreen();
		starship.showAlert();
	}
}
