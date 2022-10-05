package for_exam;

public class ForPrintExample {
	public static void main(String[] args) {
		// (초기화식;조건식;증감식)
		// 조건식이 true이면 중괄호 블럭 실행
		// 초기화식 - 반복구간[조건식 - 실행문 - 증감식]
		int i;
		for(i = 0; i<5; i++) {
			// 반복되는 코드
			System.out.println("Hello"+i);
		}
		System.out.println(i);
	}

}
