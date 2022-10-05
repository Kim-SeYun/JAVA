package method;

public class MethodExample3 {
	public static void main(String[] args) {
		System.out.println("메인메소드 시작");
		String message = getMessage();
		
		System.out.println("반환값 : " + message);
		System.out.println("메인메소드 끝");
	}
	
	public static String getMessage() {
		String str = "Hello";
		return str;
	}
	
}


