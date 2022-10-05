package scanner_exam;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		//데이터타입 변수명 ~ 원시(primitive)타입
		int value = 11;
		
		// 데이터타입 : Scanner 변수명 : scan ~ 참조(reference)타입
//		Scanner scan;  // 변수선언
		// new 연산자를 통해 객체 생성
		Scanner scan = new Scanner(System.in);
		
		// scan변수명을 통해 스캐너 객체의 nextLine()메소드 참조한다.
		System.out.print(" >> 값을 입력하세요");
//		String inputValue = scan.nextLine();
//		System.out.println("입력한 값 : " + inputValue);
		int inputValue = scan.nextInt();
		System.out.println("입력한 값 : " + inputValue); 
		System.out.println("메인 종료");
		
	}

}
