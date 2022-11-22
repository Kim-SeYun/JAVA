package exam;

public class Compositenumber {
	public static void main(String[] args) {
		int n = 10;
		int result = 0;
//		for(int i=4; i<=10; i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		for(int i=2; i<=n; i++) {
			boolean isPrime = true;
			for(int j=2; j*j<=i; j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
				}
			if(isPrime) {
				System.out.println(i + "");
			}
		}
	
		
	}

}
