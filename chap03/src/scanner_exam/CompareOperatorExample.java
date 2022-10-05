package scanner_exam;

import java.util.Scanner;

public class CompareOperatorExample {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 값 입력 >>");
		int inputInt1 = scan.nextInt();
		
		System.out.print("두번째 값 입력 >>");
		int inputInt2 = scan.nextInt();
		
		if(inputInt1==inputInt2) {
			System.out.println("두 입력값은 같다");
			return;
		}
		if(inputInt1!=inputInt2) {
			System.out.println("두 입력값은 서로 다르다");
			
		}
		if(inputInt1>inputInt2) {
			System.out.println("첫 번째 입력값이 더 크다");
			return;
			
		}
		if(inputInt1<inputInt2) {
			System.out.println("두 번째 입력값이 더 크다");
			return;
		}
	}

}
