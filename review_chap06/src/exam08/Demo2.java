package exam08;

public class Demo2 {
	public static void main(String[] args) {
		// NumberFormatException
		// ���ڿ� -> ����
		int result1 = Integer.parseInt("123");
		int result2 = Integer.parseInt("111");
		System.out.println(result1+result2);
		
		
		try {
			Integer.parseInt("12_34SSS"); // ���ܹ߻� - ���α׷� �ߴ�
			
		} catch (NumberFormatException e) {
			System.out.println("�߸��� �Է� ��");
		}
		
		System.out.println("���θ޼ҵ�����");
	}

}
