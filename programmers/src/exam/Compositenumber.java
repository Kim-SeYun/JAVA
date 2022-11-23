package exam;

public class Compositenumber {
	public static void main(String[] args) {
		int n = 10;
		int result = 0;
		int count = 0;

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if(i%j==0) result++;
		}
			if(result>=3) {
				count++;
			}
			result=0;
		
	}
		System.out.println(count);
	}
}
