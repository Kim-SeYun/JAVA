package scanner_exam;

import java.util.Scanner;

public class LogicOperatorExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� >>");
		String nickName = scanner.nextLine();
		
		boolean minTest = nickName.length() >= 3;
		boolean maxTest = nickName.length() <= 5;
		
		int nickNameSize = nickName.length();
		if(minTest || maxTest) {
			System.out.println("������ �ԷµǾ����ϴ�.");
			System.out.println("�Է� �� ���� : " + nickName);
			return;
		}
		System.out.println("������ 3���� ~ 5���ڷ� �Է��ϼ���");
	}

}
