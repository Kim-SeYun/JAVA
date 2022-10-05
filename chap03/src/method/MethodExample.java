package method;

public class MethodExample {
	
	// 메인메소드
	//   String[]      args  : 매개변수
	// (매개변수 타입) (매개변수이름)
	// 매개변수 = 인수 = 인자 = 파라미터
	public static void main(String[] args) {
		System.out.println("메인메소드를 실행함");
		
		String greeting = "안녕하세요?"; // 문자열 데이터
		System.out.println("proceed메소드를 호출합니다.");
		proceed(greeting);
		System.out.println("메인메소드 끝");
	}
		
	
	
	public static void proceed(String message) { // message "안녕하세요?" 할당
		System.out.println("proceed메소드가 호출됨");
		System.out.println(message);
	
	}

}
