package exam10;

import java.util.Scanner;

public class CatchOrderDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(">> ȸ����ȣ �Է� : ");
		
		
		try {
			String inputValue = scan.nextLine();
			int id = Integer.parseInt(inputValue);
			System.out.println("�Է��� ��ȣ : " + id);
		
		} catch (Exception e) {
			System.out.println("���ܹ߻�");
		} finally {
			// ���ҽ� �ݳ�
			scan.close();
		}
	}

}
