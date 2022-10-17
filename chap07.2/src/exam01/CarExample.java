package exam01;

public class CarExample {
	public static void main(String[] args) {
		Tire[] tires = {
				new KumhoTire("앞왼쪽", 6),
				new HankookTire("앞오른쪽", 2),
				new HankookTire("뒤왼쪽", 3),
				new KumhoTire("뒤오른쪽", 4)
			};
		Car car = new Car(tires);
		
		for (int i = 0; i < 5; i++) {
			int problemLocation = car.run();
			if(problemLocation !=0) {
				System.out.print(car.tires[problemLocation-1].location);
				System.out.println("한국타이어로 교체");
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 10);
			}
			
			System.out.println("===================");
		}
	}

}