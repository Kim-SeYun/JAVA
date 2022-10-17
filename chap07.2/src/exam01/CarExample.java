package exam01;

public class CarExample {
	public static void main(String[] args) {
		Tire[] tires = {
				new KumhoTire("�տ���", 6),
				new HankookTire("�տ�����", 2),
				new HankookTire("�ڿ���", 3),
				new KumhoTire("�ڿ�����", 4)
			};
		Car car = new Car(tires);
		
		for (int i = 0; i < 5; i++) {
			int problemLocation = car.run();
			if(problemLocation !=0) {
				System.out.print(car.tires[problemLocation-1].location);
				System.out.println("�ѱ�Ÿ�̾�� ��ü");
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 10);
			}
			
			System.out.println("===================");
		}
	}

}