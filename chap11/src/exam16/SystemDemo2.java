package exam16;

public class SystemDemo2 {
	public static void main(String[] args) throws InterruptedException {
		// 1���� 2000000������ ���� ���ϴµ� �ɸ��� �ð�
		long start = System.currentTimeMillis();
		int sum = 0;
		for (int i = 0; i < 2000; i++) {
			Thread.sleep(1);
			sum += i; 
			
		}
		long end = System.currentTimeMillis();
		long during = end - start;
		System.out.println("�ҿ�ð�" + during + "�и�������");
	}

}
