package initialization.solution;

enum Money {
	ONE, FIVE, TEN, TWEENTY, FIFTY, HUNDRED
}

public class Ex21 {
	public static void main(String[] args){
		for(Money i : Money.values()){
			System.out.println("value: " + i  + " ordinal " + i.ordinal());
		}
		Money a = Money.FIFTY;
		switch(a){
			case ONE: System.out.println("1");break;
			case FIVE: System.out.println("5");break;
			case TEN: System.out.println("10");break;
			case TWEENTY: System.out.println("20");break;
			case FIFTY: System.out.println("50");break;
			case HUNDRED: System.out.println("100");break;
			default: 
		}
	}
}
