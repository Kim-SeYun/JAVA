package operation;

public class IncDecOperationExample2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int result1 = ++x + 5; // 전위증가 16
		int result2 = y++ + 5; // 후위증가 15
		System.out.println("전위증가 = " + result1); 
		System.out.println("후위증가 = " + result2); 
	}

}
