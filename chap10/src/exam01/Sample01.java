package exam01;

public class Sample01 {
	public static void main(String[] args) throws ClassNotFoundException {
		int[] arr = {1,2,3}; // ������ �ε��� ��ȣ: 2
		System.out.println(arr[3]); // ���࿹��(RuntimeException)
		
		// �Ϲݿ��� : ������ �� �ݵ�� ����ó�� �ڵ带 �ۼ��ؾ���
//		Class.forName("");
		test01();
	}
	
	// �޼ҵ� ������ ���ܸ� ����
	// �޼ҵ� �� : �� �޼ҵ带 ȣ���� �޼ҵ�
	public static void test01() throws ClassNotFoundException {
		test02();
	}
	
	public static void test02() throws ClassNotFoundException {
		Class.forName("");
		
	}

}
