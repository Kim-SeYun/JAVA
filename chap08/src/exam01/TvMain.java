package exam01;

public class TvMain {
	public static void main(String[] args) {
//		Television tv = new Television();
		// �������̽�(RemoteControl) Ÿ���� ������ü(Television)�� ����Ÿ���� �� �� �ִ�.
		RemoteControl tv = new Television();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(100);
		tv.setVolume(-10);
		tv.setVolume(5);
		tv.setMute(false); // ����Ʈ �޼ҵ�
		
		RemoteControl audio = new Audio();
		audio.turnOn();
		audio.turnOff();
		audio.setVolume(100);
		tv.setVolume(-10);
		tv.setVolume(5);
		tv.setMute(false); // ����Ʈ �޼ҵ�
		
		
		// RemoteContol �������̽�
		// Dummy �߻�Ŭ����
		// DummyB ����Ŭ����
		RemoteControl d = new DummyB();
		Dummy d2 = new DummyB();
	}

}
