package while_exam;

import java.util.Scanner;

public class BreakExample2 {
	public static void main(String[] args) {
		int num; // �Է�
		int sum = 0; // �հ�
		
		Scanner scan = new Scanner(System.in);
		System.out.println("0�� �Է��ϸ� ����");
		
		do { // num = 0�� �ƴϸ� �ݺ��� ��� ����
			System.out.print(">>");
			num = scan.nextInt();
			
//			if(num == 0) break; // 0�� �Է��ϸ� �ݺ��� Ż�� 
			
			sum += num;
			
		}while (num!=0);
		System.out.println("�հ� : " + sum);
		System.out.println("���α׷� ����");
	
	}
}
