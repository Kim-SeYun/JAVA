package method;

public class MethodExample2 {
	public static void main(String[] args) {
		System.out.println("AA메소드를 호출합니다.");
		methodAA();
		System.out.println("BB메소드를 호출합니다.");
		methodBB();
		System.out.println("메인메소드 끝");
	}

	private static void methodAA() {
		System.out.println("메소드 AA 호출");
		otherAA("Hello");
		
	}

	private static void methodBB() {
		System.out.println("메소드 BB 호출");
		
	}

	private static void otherAA(String message) {
		System.out.println("otherAA메소드 호출");
		System.out.println("전달받은 값 : " + message);
		
	}
	
	
}


