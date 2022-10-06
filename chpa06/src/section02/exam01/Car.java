package section02.exam01;

public class Car {
	
	// 인스턴스 메소드, 비정적 메소드
	// non-static 메소드
	// 객체의 개별적인 동작
	// 객체 생성 후 호출 된다.
	// 참조변수 통해 호출 car.run()
	int run(String message) {
		System.out.println("run메소드 실행");
		System.out.println("전달된 매개값 : " + message);
		return message.length();
	}
	void stop() {
		System.out.println("stop메소드 실행");
	}
	
	void sound() {
		System.out.println("sound메소드 실행");
	}
	
	// static 메소드
	// 정적 메소드
	// 객체 생성 유무와 관계없이 사용할 수 있음
	// 클래스명.메소드명 Car.isLeftGas()
	static void isLeftGas() {
		System.out.println("isLeftGas");
	}
}
