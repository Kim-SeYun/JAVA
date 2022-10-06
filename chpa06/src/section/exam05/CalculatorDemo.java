package section.exam05;

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int result1 = cal.add(10, 20);
		int result2 = cal.add("10", "20");
		int result3 = cal.add(10, "20");
		int result4 = cal.add("10", 20);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
