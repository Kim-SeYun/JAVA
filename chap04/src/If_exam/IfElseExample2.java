package If_exam;

import java.util.Scanner;

public class IfElseExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 입력 >> ");
		int score = scanner.nextInt();
		ifElseTest(score);
		
	}

	private static void ifElseTest(int score) {
		if(score >= 90) {
			System.out.println("90점 이상");
			System.out.println("A등급");
			return;
		}
			System.out.println("90점 미만");
			System.out.println("B등급");
		}
	

}
