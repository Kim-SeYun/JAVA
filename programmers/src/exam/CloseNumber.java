package exam;

import java.util.Arrays;

public class CloseNumber {
	public static void main(String[] args) {
		int[] array = {3, 10, 28};
		int n = 20;
		int answer = 0;
		int[] aa = new int[array.length];
		
		for(int i=0; i<array.length; i++) {
			answer = Math.abs(array[i]-n);
			System.out.println(answer);
			aa[i] =answer;
			
		}
		System.out.println(Arrays.toString(aa));
	}

}
