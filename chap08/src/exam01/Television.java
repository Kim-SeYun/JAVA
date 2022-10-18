package exam01;

// Television RemoteControl �������̽��� ����
// �߻�޼ҵ带 ��� ����(�������̵�)�ؾ� �Ѵ�.
// ����Ʈ �޼ҵ�� ���������� �������̵� �� �� �ִ�.
public class Television implements RemoteControl{
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV ��");
	}

	@Override
	public void turnOff() {
		System.out.println("TV ��");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}else if(volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);
	}

}
