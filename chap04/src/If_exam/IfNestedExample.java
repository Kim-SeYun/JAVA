package If_exam;

import java.util.Scanner;

public class IfNestedExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수입력 >> ");
		int score = scanner.nextInt();
		
		int x = 0;
		String grade = null;
		if(score>=90) {
//			if(score>=95) {
//				grade = "A+";
//			}else {
//				grade = "A";
//			}
			grade = score >= 95 ? "A+" : "A";
		}else {
//			if(score>=85) {
//				grade = "B+";
//			}else {
//				grade = "B";
//			}
			grade = score >= 85 ? "B+" : "B";
		}
		System.out.println("학점 : " + grade);
	}

}
