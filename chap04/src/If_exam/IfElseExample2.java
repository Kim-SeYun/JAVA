package If_exam;

import java.util.Scanner;

public class IfElseExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int score = scanner.nextInt();
		ifElseTest(score);
		
	}

	private static void ifElseTest(int score) {
		if(score >= 90) {
			System.out.println("90�� �̻�");
			System.out.println("A���");
			return;
		}
			System.out.println("90�� �̸�");
			System.out.println("B���");
		}
	

}
