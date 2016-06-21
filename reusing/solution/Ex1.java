package reusing.solution;


class ExFoo1 {
	void foo(int i){
		System.out.println("foo shape");
	}
	public String toString(){
		return " a ExFoo1 ";
	}
}

class ShapeHome {
	ExFoo1 i ;
	public String toString(){
		if(i == null){
			i = new ExFoo1();
		}
		return i.toString();
	}
	
}

public  class Ex1 {
	public static void main(String[] args){
		ShapeHome ob = new ShapeHome();
		System.out.println(ob.i);
		System.out.println(ob);
	}
}