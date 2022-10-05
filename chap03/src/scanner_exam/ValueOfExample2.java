package scanner_exam;

import java.util.Scanner;

public class ValueOfExample2 {
	public static void main(String[] args) {
		
		System.out.print("�ݾ��� �Է��ϼ��� >>");
		Scanner scan = new Scanner(System.in);
		
		String inputValue = scan.nextLine();
		
		try {
			double val = Double.valueOf(inputValue); // NaN ���ɼ�����
			if(!Double.isNaN(val)) { // val�� NaN �ƴϸ� ����ض�
				double currentBalance = 1000.0;
				System.out.println(val + "�� �Ա�");
				currentBalance = currentBalance + val;
				System.out.println("�ܾ� : " + currentBalance);
				return;
				
			}
			System.out.println("NaN : �ùٸ� ���� �ƴմϴ�.");
			
		} catch (Exception e) {
			System.out.println("���ܹ߻� : �ùٸ� ���� �Է��ض�");
		}
	}

}
