package exam16;

public abstract class Hero { // �߻�Ŭ����
	// �ʵ�, �Ϲݸ޼ҵ�, ������, �߻�޼ҵ�
	// new �����ڷ� ��ü���� �Ұ�
	void move() {
		System.out.println("�̵��մϴ�.");
	}
	
	void attack() {
		System.out.println("�����մϴ�.");
	}
	
	abstract void useUlt(); // �߻�޼ҵ�
	

}
