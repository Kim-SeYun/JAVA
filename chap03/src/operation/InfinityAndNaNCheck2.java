package operation;

public class InfinityAndNaNCheck2 {
	public static void main(String[] args) {
		
		double result1 = 5/0.0; // Infinity
		double result2 = 5%0.0; // NaN
		double result3 = 10%4.5;
		
		isNanOrInfinite(result1);
		isNanOrInfinite(result2);
		isNanOrInfinite(result3);
	}

	private static void isNanOrInfinite(double result) {
		if(Double.isInfinite(result) || Double.isNaN(result)) {
			System.out.println("연산을 수행할 수 없습니다.");
			return;
			
		}
		System.out.println("연산결과 : " + result );
		
	}
}
