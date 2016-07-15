package interfaces.solution;
interface inter1 {
	public void foo1();
}
interface inter2 extends inter1 {
	public void foo2();
}
interface inter3  extends inter1 {
	public void foo3();
}
interface inter4 extends inter2,inter3 {
	
}


public class Ex13 {

}
