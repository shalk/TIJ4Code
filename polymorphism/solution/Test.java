package polymorphism.solution;
import static net.mindview.util.Print.*;

interface I1 { void f();}
interface I2 { int f(int i);}
interface I3 { int f();}

class C { public int f(){ return 1;}}
class C1 implements I1,I2 {
	public void f(){
		
	}

	public int f(int i) {
		return 0;
	}
}
class C2 extends C implements I2 {
	public int f(int i ){
		return i;
	}
}