package section02.exam05;

public class Calculator {
	
	static double pi = 3.14;
	
	static int add(int x, int y) {
		return x + y;
	}
	
	int plus(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		int result = Calculator.add(7, 5);
		int result2 = add(10, 7);
		System.out.println(result);
		
		// Ŭ���� ���ο��� �ν��Ͻ� �޼ҵ� ȣ��
		// ��ü������ �ؾ��Ѵ�.
		Calculator calculator = new Calculator();
		int result3 = calculator.plus(10, 2);
	}

}
