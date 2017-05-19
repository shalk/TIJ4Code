package exceptions.solution.ex24;


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
		try{
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
		}catch (Exception e){
			throw e;
		}finally{
			dispose();
		}

	}
	void dispose(){
		if( light1 != null){
			light1.off();
		}
		if( light2 != null ){
			light2.off();
		}
		System.out.println("failling dipose");
	}

	public static void main(String[] args){
		try {
			FailingConstructor f = new FailingConstructor();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			
		}
		
	}
}
