package exam;

import java.util.Arrays;

public class Max2 {
	public static void main(String[] args) {
		int[] numbers = {0, 31, 24, 10, 1, 9};
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
//		int last = numbers[numbers.length-1];
//		int first = numbers[numbers.length-2];
		int max = numbers[numbers.length-1]*numbers[numbers.length-2];
		System.out.println(max);
		
	}

}
