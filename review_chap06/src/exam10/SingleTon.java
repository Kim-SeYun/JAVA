package exam10;

public class SingleTon {
	static SingleTon single= new SingleTon();
	
	private SingleTon() {
		
	}
	
	public static SingleTon getInstance() {
		return single;
	}
		

}
