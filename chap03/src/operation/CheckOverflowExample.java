package operation;

public class CheckOverflowExample {
	public static void main(String[] args) {
		// 정수 덧셈에서 오버플로우 발생 가능성
		// 두 정수의 부호가 같을 때만
		int d = 2100000000;
		
		try {
			
			int result = safeAdd(2100000000, 2100000000); // 예외발생 가능성 있음
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	private static int safeAdd(int left, int right) {
		boolean allPositive = left > 0 && left > 0; // 모두 양수 인 경우
		boolean allNegative = right < 0 && left < 0; // 모두 음수 인 경우
		
		// 다음이 true이면 오버플로우 발생함
		boolean maxBounded = allPositive && left  > Integer.MAX_VALUE - right;
		boolean minBounded = allNegative && right < Integer.MAX_VALUE - left;
		
		
		if(maxBounded || minBounded) {
			// 예외던짐
			throw new ArithmeticException("오버플로우가 발생하여 정확히 계산할 수 없음");
		}
		return left + right;
		
	}

}
