package scanner_exam;

import java.util.Scanner;

public class ConditionOperationExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����Է� >>");
		int score = scanner.nextInt();
		
		String result = score >= 60 ? "�հ�" : "���հ�";
		System.out.println(result);
	}

}
