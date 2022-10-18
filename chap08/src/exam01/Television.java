package exam01;

// Television RemoteControl 인터페이스를 구현
// 추상메소드를 모두 구현(오버라이딩)해야 한다.
// 디폴트 메소드는 선택적으로 오버라이딩 할 수 있다.
public class Television implements RemoteControl{
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV 켬");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 끔");
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
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

}
