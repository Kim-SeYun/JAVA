package scanner_exam;

import java.util.Scanner;

public class ConditionOperationExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수입력 >>");
		int score = scanner.nextInt();
		
		String result = score >= 60 ? "합격" : "불합격";
		System.out.println(result);
	}

}
