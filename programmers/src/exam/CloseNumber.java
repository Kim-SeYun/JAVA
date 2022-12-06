package exam;

import java.util.Arrays;

public class CloseNumber {
	public static void main(String[] args) {
		int[] array = {3, 28, 12};
		int n = 20;
		int answer = 0;
		int min = Math.abs(array[0]-n);
		int minIndex = 0;
		Arrays.sort(array);
		
		for(int i=0; i<array.length; i++) {
			if( Math.abs(array[i]-n)< min){
				min = Math.abs(array[i]-n);
				minIndex = i;
			}
			
			}
		System.out.println(min);
		System.out.println(minIndex);
		System.out.println(array[minIndex]);
		
	}

}
