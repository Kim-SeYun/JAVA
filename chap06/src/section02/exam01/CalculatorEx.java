package section02.exam01;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		System.out.println("���� ����� : " + calculator.plus(10, 15));
		
		calculator.powerOn();
//		calculator.powerState = true;
		System.out.println("���� ����� : " + calculator.plus(10, 15));
		calculator.powerOff();
		
		System.out.println("������ ����� : " + calculator.divide(20, 6));
		
	}

}
