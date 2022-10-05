package scanner_exam;

import java.util.Scanner;

public class ValueOfExample2 {
	public static void main(String[] args) {
		
		System.out.print("금액을 입력하세요 >>");
		Scanner scan = new Scanner(System.in);
		
		String inputValue = scan.nextLine();
		
		try {
			double val = Double.valueOf(inputValue); // NaN 가능성있음
			if(!Double.isNaN(val)) { // val이 NaN 아니면 계산해라
				double currentBalance = 1000.0;
				System.out.println(val + "원 입금");
				currentBalance = currentBalance + val;
				System.out.println("잔액 : " + currentBalance);
				return;
				
			}
			System.out.println("NaN : 올바른 값이 아닙니다.");
			
		} catch (Exception e) {
			System.out.println("예외발생 : 올바른 값을 입력해라");
		}
	}

}
