package operation;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		
		try {
			int result = num1 / num2; // ���ܹ߻����ɼ�����
			System.out.println(result);
			
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			System.out.println(e.getMessage());

		}
		
	}

}
