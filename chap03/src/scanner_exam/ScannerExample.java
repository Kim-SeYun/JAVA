package scanner_exam;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		//������Ÿ�� ������ ~ ����(primitive)Ÿ��
		int value = 11;
		
		// ������Ÿ�� : Scanner ������ : scan ~ ����(reference)Ÿ��
//		Scanner scan;  // ��������
		// new �����ڸ� ���� ��ü ����
		Scanner scan = new Scanner(System.in);
		
		// scan�������� ���� ��ĳ�� ��ü�� nextLine()�޼ҵ� �����Ѵ�.
		System.out.print(" >> ���� �Է��ϼ���");
//		String inputValue = scan.nextLine();
//		System.out.println("�Է��� �� : " + inputValue);
		int inputValue = scan.nextInt();
		System.out.println("�Է��� �� : " + inputValue); 
		System.out.println("���� ����");
		
	}

}
