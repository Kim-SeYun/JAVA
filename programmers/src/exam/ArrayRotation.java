package exam;

import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args) {
		int[] numbers = {4,455,6,4,-1,45,6};
		String direction = "left";
		
		if(direction.equals("right")) {
			int temp = numbers[numbers.length-1];
			for(int i=numbers.length-1; i>=1; i--) {
				numbers[i] = numbers[i-1];
			}
			numbers[0] = temp;
		} else if(direction.equals("left")) {
			int k = numbers[0];
			for(int j=0; j<numbers.length-1; j++) {
				numbers[j] = numbers[j+1];
			}
			numbers[numbers.length-1] = k;
		}
		System.out.println(Arrays.toString(numbers));
		
	}

}
