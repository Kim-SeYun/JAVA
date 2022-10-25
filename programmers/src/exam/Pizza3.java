package exam;

public class Pizza3 {
	public static void main(String[] args) {
		int slice = 4;
		int n = 12;
		int result = n/slice;
		if(n%slice != 0) {
			result++;			
		}else System.out.println(result);
		System.out.println(result);
	}

}
