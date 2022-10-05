package scanner_exam;

import java.util.Scanner;

public class LogicOperatorExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("별명을 입력하세요 >>");
		String nickName = scanner.nextLine();
		
		boolean minTest = nickName.length() >= 3;
		boolean maxTest = nickName.length() <= 5;
		
		int nickNameSize = nickName.length();
		if(minTest || maxTest) {
			System.out.println("별명이 입력되었습니다.");
			System.out.println("입력 한 별명 : " + nickName);
			return;
		}
		System.out.println("별명은 3글자 ~ 5글자로 입력하세요");
	}

}
