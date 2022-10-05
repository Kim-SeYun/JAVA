package array_type;

public class ArrayCreateByValueListEx4 {
	public static void main(String[] args) {
		
		// {}이용한 배열 생성 방식은 선언과 초기화를 분리할 수 없다.
		int[] scores; // 선언
		
		
		String[] names = {"홍길동", "김길동"};
		
		names = new String[] {"홍", "김"};
	}

}
