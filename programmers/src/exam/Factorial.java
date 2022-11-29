package exam;

public class Factorial {
	public static void main(String[] args) {
		int n = 10;
		int result = 1;
		
		for(int i=n; i>0; i--) {
			result *= i;
		}
		System.out.println(result);
		
	}

}
