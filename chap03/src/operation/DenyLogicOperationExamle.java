package operation;

public class DenyLogicOperationExamle {
	public static void main(String[] args) {
		int value = 10;
		if(!(value > 20 )) {
			System.out.println("value���� 20���� ũ�� �ʴ�.");
		}
		// !(10>20)
		// !(false)
		// true
		
		System.out.println(20 > 10); // 20�� 10���� ũ��.
		System.out.println(20 >= 10); // 20�� 10���� ũ�ų� ����.
			//20�� 10���� �����ʴ�.
		
		System.out.println(20 < 10); // 20�� 10���� �۴�.
		System.out.println(20 <= 10); // 20�� 10���� �۰ų� ����.
			//20�� 10���� ũ���ʴ�.
		
		System.out.println(20 == 10); // 20�� 10�� ����.
		System.out.println(20 != 10); // 20�� 10�� �ٸ���. 
		
	}

}
