package If_exam;

import java.util.Scanner;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����Է� >> ");
		int score = scanner.nextInt();
		
		if(score >= 90) {
			System.out.println("90�� �̻�");
			
		}else if(score >= 80) {
			System.out.println("80�� �̻� 90�� �̸�");
			
		}else if(score >= 70) {
			System.out.println("70�� �̻� 80�� �̸�");
		}else  {
			System.out.println("70�� �̸�");
			
		}
		
	}

}
