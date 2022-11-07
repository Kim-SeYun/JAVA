package exam;

public class Pizza2 {
	public static void main(String[] args) {
		int n = 10;
		int m = 6;
		int gcd = 0;
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0 && m%i == 0)
				gcd = i;
		}
		
		int min = (n*6)/gcd;
		System.out.println(min);
		int result = min/m;
		System.out.println(result);
		
	}


}
