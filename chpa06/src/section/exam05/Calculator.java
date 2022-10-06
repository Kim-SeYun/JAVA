package section.exam05;

public class Calculator {
	
	// 메소드 오버로딩
	int add(int x, int y) {
		return x+y;
	}
	
	int add(String x, String y) {
		return Integer.parseInt(x) + Integer.parseInt(y);
	}
	
	int add(int x, String y) {
		return x + Integer.parseInt(y);
	}
	
	int add(String x, int y) {
		return Integer.parseInt(x) + y;
	}

}
