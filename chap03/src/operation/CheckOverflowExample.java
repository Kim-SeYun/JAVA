package operation;

public class CheckOverflowExample {
	public static void main(String[] args) {
		// ���� �������� �����÷ο� �߻� ���ɼ�
		// �� ������ ��ȣ�� ���� ����
		int d = 2100000000;
		
		try {
			
			int result = safeAdd(2100000000, 2100000000); // ���ܹ߻� ���ɼ� ����
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	private static int safeAdd(int left, int right) {
		boolean allPositive = left > 0 && left > 0; // ��� ��� �� ���
		boolean allNegative = right < 0 && left < 0; // ��� ���� �� ���
		
		// ������ true�̸� �����÷ο� �߻���
		boolean maxBounded = allPositive && left  > Integer.MAX_VALUE - right;
		boolean minBounded = allNegative && right < Integer.MAX_VALUE - left;
		
		
		if(maxBounded || minBounded) {
			// ���ܴ���
			throw new ArithmeticException("�����÷ο찡 �߻��Ͽ� ��Ȯ�� ����� �� ����");
		}
		return left + right;
		
	}

}
