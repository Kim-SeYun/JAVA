package exam11;

public class Demo { // class�տ� final���̸� ��� �Ұ�
	
	final int a;
	
	public Demo(int a) {
		this.a= a;
	}
	
	public final void methodAA() {
		System.out.println("�������̵� ����");
	}
	
	public static void main(String[] args) {
		final int test;
		test = 10; // �ʱ�ȭ
//		test = 15; // ���Ҵ�
		System.out.println(test);
		Demo demo = new Demo(10); // �����ڿ��� �ʱ�ȭ
//		demo.a=10; // (final�ʵ忡��)���Ҵ� �Ұ���
	}

}
