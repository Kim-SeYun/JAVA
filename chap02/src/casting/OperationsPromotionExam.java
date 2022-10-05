package casting;

public class OperationsPromotionExam {
	public static void main(String[] args) {
		byte bv1 = 10;
		byte bv2 = 20;
		int result = bv1 + bv2;
		
		char charValue = 'A'; // 65
		char charValue2 = 1;
		int result2 = charValue + charValue2;
		
		int intValue3 = 10;
		int intValue4 = 4;
		int result3 = intValue3 / intValue4; // 2.5
		System.out.println(result3);
		
		double result4 = intValue3 / intValue4;
		// 10(int) / 4(int) = 2
		// 2.0
		System.out.println(result4);
		
		double result5 = (double)intValue3 / intValue4;
		System.out.println(result5);
		
		// (double)int /int
		// double / int
		// double / double
		// double
	}

}
