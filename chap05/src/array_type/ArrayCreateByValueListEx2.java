package array_type;

public class ArrayCreateByValueListEx2 {
	public static void main(String[] args) {
		
		// 배열의 선언과 초기화
		int[] scores = {83, 90, 87 ,70, 75};
		
		// 배열 요소의 접근
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		int scores2 = scores[2]; // 87
		System.out.println(scores2);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
	}

}
