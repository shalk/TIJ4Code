package reusing.solution.Ex12;

class Component1 {
//	Component1(){
//		System.out.println("com1");
//	}
	Component1(int i ){
		System.out.println("com1 " + i);
	}
	void dispose(){
		System.out.println("com1 dispose");
	}
}
class Component2 {
//	Component2(){
//		System.out.println("com2 ");
//	}

	Component2(int i){
		System.out.println("com2 " + i);
	}
	void dispose(){
		System.out.println("com2 dispose");
	}
}
class Component3 {
//	Component3(){
//		System.out.println("com3");
//	}
	Component3(int i){
		System.out.println("com3 " + i);
	}
	void dispose(){
		System.out.println("com3 dispose");
	}
}
class Root {
	Component1 cp1 = new Component1(1);
	Component2 cp2 = new Component2(2);
	Component3 cp3 = new Component3(3);
//	Root(){
//		System.out.println("root");
//	}
	Root(int i){
		System.out.println("root " + i);
	}
	void dispose(){
		System.out.println("Root dispose");
		cp1.dispose();
		cp2.dispose();
		cp3.dispose();
	}
}
class Stem extends Root {
//	Stem(){
//		System.out.println("stem");
//	}
	Stem(int i ){
		super(i);
		System.out.println("stem " + i);
	}
	void dispose(){
		System.out.println("Stem dispose");
		super.dispose();
	}
}


public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stem ob = new Stem(3);
		ob.dispose();
		
	}

}
