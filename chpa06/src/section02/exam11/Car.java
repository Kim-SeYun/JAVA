package section02.exam11;

public class Car {
	private int speed;
	private boolean stop;
	
	public Car(int speed, boolean stop) {
		this.speed = speed;
		this.stop = stop;
	}
	void run() {
		System.out.println("~~~run~~~~");
	}
	
	// gatter 게터 메소드
	// 이름 필드의 첫글자 대문자로 변경
	// 접두사로 get을 붙임 getSpeed
	// 접근제한자 : public
	public int getSpeed() {
		return speed;
	}
	public boolean isStop() {
		return stop;
	}
	
	// setter
	public void setSpeed(int speed) {
		if(speed<0) {
			System.out.println("음의 값 설정 불가능");
			this.speed = 50;
			return;
		}
		if(speed>200) {
			System.out.println("200초과 금지");
			this.speed = 200;
			return;
		}
		this.speed = speed;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

}
