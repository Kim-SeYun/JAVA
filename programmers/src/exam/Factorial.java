package exam;

public class Factorial {
	public static void main(String[] args) {
		int n = 7;
		int result = 1;
		
		// ���丮�� ���ϴ� �ڵ�
//		for(int i=n; i>0; i--) {
//			result *= i;
//		}
//		System.out.println(result);
		
		for(int i=1; i>0; i++) {
			result *= i;
			
			if(result==n) {
				System.out.println(i);
			}else if(result>n) {
				System.out.println(i-1);
				break;
			}
		}
	}

}
