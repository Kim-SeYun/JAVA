package operation;

public class RemainderOperationExample {
	public static void main(String[] args) {
		// ������ ������ %
		
		// �����ǿ����� 0���� �����ϴ� ���
//		System.out.println(10%0);
		
		char ch1 = '��'; // 44032
		char ch2 = 'A'; // 65
		int result1 = ch1 % ch2;
		System.out.println("result1 : " + result1);
		
		// �ǿ����ڰ� ������ ���
		int num1 = -10;
		int num2 = -3;
		int result2 = num1 / num2;
		System.out.println("result2 : " + result2); // -1
		// -10 % |-3|
		// -10 % 3
		// -1
		
		int num3 = 10;
		int num4 = -3;
		System.out.println(num3 % num4); // 1
		// 10 % |-3|
		// 10 % 3
		// 1
	}

}
