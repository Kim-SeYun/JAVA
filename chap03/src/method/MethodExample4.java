package method;

public class MethodExample4 {
	
	public static void main(String[] args) {
		System.out.println("메인메소드 시작");
		int num1 = 12;
		int num2 = 11;
		int result = add(num1, num2);
		System.out.println(result);
		System.out.println("메인메소드 끝");
		
	}
		
	// 반환타입 : int
	// 매개변수 : int, int
	public static int add(int a, int b) {
		return a + b;
	}
}
