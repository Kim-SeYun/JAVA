package exam03;

public class Main {
	public static void main(String[] args) {
		Barracks b1 = new Barracks();
		b1.buildComplete(); // Building에 정의된 메소드
		b1.lift(); // Liftable에 정의
		b1.repare(); // Repareable에 정의
		b1.generate(); // Generatable에 정의
		
		Building b2 = new Barracks();
		b2.buildComplete(); // Building에 정의된 메소드
		b2.lift(); // Liftable에 정의
		b2.repare(); // Repareable에 정의
		b2.generate(); // Generatable에 정의
		
		Liftable b3 = new Barracks(); //Liftable에 있는것만 정의 가능 나머지는 타입캐스팅해야함
		((Barracks)b3).buildComplete(); // Building에 정의된 메소드
		b3.lift(); // Liftable에 정의
		((Barracks)b3).repare(); // Repareable에 정의
		((Barracks)b3).generate(); // Generatable에 정의
		
	}

}
