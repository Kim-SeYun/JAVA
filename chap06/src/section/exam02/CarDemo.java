package section.exam02;



public class CarDemo {
	public static void main(String[] args) {
		Car car = new Car(); // Car() ������ �޼ҵ�
		car.setInfo("����", "�ҳ�Ÿ", 200);
		
		Car car2 = new Car("�Ｚ", "SM3", 250);
		car2.printInfo();
	}

}
