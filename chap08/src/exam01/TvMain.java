package exam01;

public class TvMain {
	public static void main(String[] args) {
//		Television tv = new Television();
		// 인터페이스(RemoteControl) 타입은 구현객체(Television)의 상위타입이 될 수 있다.
		RemoteControl tv = new Television();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(100);
		tv.setVolume(-10);
		tv.setVolume(5);
		tv.setMute(false); // 디폴트 메소드
		
		RemoteControl audio = new Audio();
		audio.turnOn();
		audio.turnOff();
		audio.setVolume(100);
		tv.setVolume(-10);
		tv.setVolume(5);
		tv.setMute(false); // 디폴트 메소드
		
		
		// RemoteContol 인터페이스
		// Dummy 추상클래스
		// DummyB 구현클래스
		RemoteControl d = new DummyB();
		Dummy d2 = new DummyB();
	}

}
