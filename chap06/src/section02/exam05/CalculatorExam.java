package section02.exam05;

public class CalculatorExam {
	public static void main(String[] args) {
		int sum = Calculator.add(10, 20);
		System.out.println(Calculator.pi);
		System.out.println(sum);
		
		Calculator calculator = new Calculator();
		int result = calculator.plus(10, 15);
		System.out.println(result);
		System.out.println(calculator.add(1, 2));
		System.out.println(calculator.pi);
		
	}

}
