package section02.exam03;

public class CalculatorDemo2 {
	public static void main(String[] args) {
		Calculator2 cal = new Calculator2();
		
		int result1 = cal.areaRectangle(10);
		int result2 = cal.areaRectangle(10, 5);
		
		System.out.println("���̰� 10�� ���簢�� ���� : " + result1);
		System.out.println("����, ���� ���̰� ���� 10, 5�� ���簢�� ���� : " + result2);

	}

}
