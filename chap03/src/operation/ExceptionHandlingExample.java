package operation;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		
		try {
			int result = num1 / num2; // 예외발생가능성있음
			System.out.println(result);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());

		}
		
	}

}
