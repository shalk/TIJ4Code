package access.solution;

class Connection {
	public static int count = 0;
	private final int  id = count++ ;
	private Connection (){}
	static Connection create(){
		return new Connection();
	}
	public String toString(){
		return "Connection id:" + id;
	}
}
public class ConnectionManager {
	private static Connection[] a;
	private static int count = 5;
	static {
		a = new Connection[count];
		for(int i = 0 ; i < count ; i++){
			a[i] = Connection.create();
		}
	}
	public ConnectionManager(){
		System.out.println("inital Connection Manager");
	}
	public static  void GetConnection(){
		if(count > 0 ){
			System.out.println(a[--count].toString());
		}else{
			System.out.println("null");
		}
		
	}
	public static void main(String[] args){
		ConnectionManager.GetConnection();
		ConnectionManager.GetConnection();
		ConnectionManager.GetConnection();
		ConnectionManager.GetConnection();
		ConnectionManager.GetConnection();
		ConnectionManager.GetConnection();
	}
	
}


