package enumeration;

public class WeekMain {
	public static void main(String[] args) {
		Week today; // ����Ÿ�� ����
		today = Week.MONDAY; // ���� ��� �Ҵ�
		// today ���ÿ���
		// Week.MONDAY �޼ҵ� ����(����)
		// MONDAY ���Ű�ü (������)
		
		Week birthday = null; // ����Ÿ���̿��� null�� �Ҵ� ����
		System.out.println(today);
		
		// ���� ��ü ��
		Week day1 = Week.MONDAY; // 1
		Week day2 = Week.WEDNESDAY; // 3
		
		// ����� ��ġ �μ�(����)
		// day1�� day2�� �������� ��� ��ġ���ִ°�
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1); // -2
		System.out.println(result2); // 2
	
	}

}
