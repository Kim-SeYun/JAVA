package scanner_exam;

import java.util.Scanner;

public class CompareOperatorExample {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù ��° �� �Է� >>");
		int inputInt1 = scan.nextInt();
		
		System.out.print("�ι�° �� �Է� >>");
		int inputInt2 = scan.nextInt();
		
		if(inputInt1==inputInt2) {
			System.out.println("�� �Է°��� ����");
			return;
		}
		if(inputInt1!=inputInt2) {
			System.out.println("�� �Է°��� ���� �ٸ���");
			
		}
		if(inputInt1>inputInt2) {
			System.out.println("ù ��° �Է°��� �� ũ��");
			return;
			
		}
		if(inputInt1<inputInt2) {
			System.out.println("�� ��° �Է°��� �� ũ��");
			return;
		}
	}

}
