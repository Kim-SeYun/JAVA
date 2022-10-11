package section02.exam04;

public class StringCalculatorEx {
	public static void main(String[] args) {
		StringCalculator cal= new StringCalculator();
		
		int result1 = cal.add(10, 2);
		int result2 = cal.add("10", "2");
		int result3 = cal.add("10", 2);
		int result4 = cal.add(10, "2");
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		// 잘못된 매개값 전달
		int result = cal.add("abcd", "2");
		System.out.println(result);
	}

}
