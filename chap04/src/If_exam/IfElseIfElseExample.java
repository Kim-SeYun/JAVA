package If_exam;

import java.util.Scanner;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수입력 >> ");
		int score = scanner.nextInt();
		
		if(score >= 90) {
			System.out.println("90점 이상");
			
		}else if(score >= 80) {
			System.out.println("80점 이상 90점 미만");
			
		}else if(score >= 70) {
			System.out.println("70점 이상 80점 미만");
		}else  {
			System.out.println("70점 미만");
			
		}
		
	}

}
