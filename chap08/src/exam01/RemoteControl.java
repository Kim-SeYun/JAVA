package exam01;

public interface RemoteControl {
	// �������̽� �ʵ�
	// ����� ������ �� �ִ�. �ν��Ͻ� �ʵ� ���� �Ұ���. ����ƽ �ʵ� ���� �Ұ���
	// public static final ������ �� ������ �����ص� public static final ������.
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// �߻�ż���(�����ż���X, �ν��Ͻ� �ż���)
	// public abstract�� ������ ����
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// �����޼ҵ� ����, public�� ������ ����
	public static void changeBattery() {
		System.out.println("������ ��ü");
		
	}
	
	// ����Ʈ �żҵ�(�����޼ҵ�X, �ν��Ͻ� �żҵ�)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("����ó��");
		}else {
			System.out.println("��������");
		}
	}
	

}
