package array_type;

public class ArrayCreateByValueListEx5 {
	public static void main(String[] args) {
		
		// 배열의 선언과 초기화
		int[] scores ;
		scores = new int[] {100, 70, 50};
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		String[] names = {"홍길동", "김길동"};
		names = new String[] {"박길동", "나길동"};
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
