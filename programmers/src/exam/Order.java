package exam;

public class Order {
	public static void main(String[] args) {
		int n= 20;
		int result = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				result++;				
			}
		}
		System.out.println(result);
	}

}
