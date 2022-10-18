package exam01;

public interface RemoteControl {
	// 인터페이스 필드
	// 상수만 선언할 수 있다. 인스턴스 필드 선언 불가능. 스태틱 필드 선언 불가능
	// public static final 생략할 수 있으며 생략해도 public static final 간주함.
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상매서드(정적매서드X, 인스턴스 매서드)
	// public abstract가 생략된 형태
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 정적메소드 가능, public이 생략된 형태
	public static void changeBattery() {
		System.out.println("건전지 교체");
		
	}
	
	// 디폴트 매소드(정적메소드X, 인스턴스 매소드)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무용처리");
		}else {
			System.out.println("무용해제");
		}
	}
	

}
