package section02.exam02;

public class Calculator {
	
	int sumAll(int[] values) { // 배열
		int sum = 0;
		for(int v : values) {
			sum += v;
		}
		return sum;
	}
	
	// 1, 2, 3, 4
	// values = new int[]{1, 2, 3, 4}
	int addAll(int ... values) { // 가변인자
		int sum = 0;
		for(int v : values) {
			sum += v;
		}
		return sum;
	}

}
