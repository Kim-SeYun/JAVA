package exam16;

public abstract class Hero { // 추상클래스
	// 필드, 일반메소드, 생성자, 추상메소드
	// new 연산자로 객체생성 불가
	void move() {
		System.out.println("이동합니다.");
	}
	
	void attack() {
		System.out.println("공격합니다.");
	}
	
	abstract void useUlt(); // 추상메소드
	

}
