package while_exam;

import java.util.Scanner;

public class BreakExample2 {
	public static void main(String[] args) {
		int num; // 입력
		int sum = 0; // 합계
		
		Scanner scan = new Scanner(System.in);
		System.out.println("0을 입력하면 종료");
		
		do { // num = 0이 아니면 반복문 계속 실행
			System.out.print(">>");
			num = scan.nextInt();
			
//			if(num == 0) break; // 0을 입력하면 반복문 탈출 
			
			sum += num;
			
		}while (num!=0);
		System.out.println("합계 : " + sum);
		System.out.println("프로그램 종료");
	
	}
}
