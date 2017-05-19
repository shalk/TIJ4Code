package exceptions.solution.ex23;


class Light {
	int id ;
	Light(int id){
		this.id = id;
		System.out.println("light "+ id + " on");
	}

	void foo() throws Exception{
		throw new Exception(" exception light " + id);
	}
	void off(){
		System.out.println("light " + id + " off");
	}
}

public class FailingConstructor {
	Light light1;
	Light light2;
	FailingConstructor() throws Exception {
		light1 = new Light(1);
		try{
			light1.foo();
		} catch(Exception e){
//			e.printStackTrace(System.out);
			throw e;
		} finally{
			light1.off();
		}
		light2 = new Light(2);
	}
	void dispose(){
		
	}

	public static void main(String[] args){
		try {
			FailingConstructor f = new FailingConstructor();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
