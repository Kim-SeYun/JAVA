package method;

public class MethodExample4 {
	
	public static void main(String[] args) {
		System.out.println("���θ޼ҵ� ����");
		int num1 = 12;
		int num2 = 11;
		int result = add(num1, num2);
		System.out.println(result);
		System.out.println("���θ޼ҵ� ��");
		
	}
		
	// ��ȯŸ�� : int
	// �Ű����� : int, int
	public static int add(int a, int b) {
		return a + b;
	}
}
