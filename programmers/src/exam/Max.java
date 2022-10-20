package exam;
import java.util.Arrays;
public class Max {
	public static void main(String[] args) {
		int[] numbers = {1,2,-3,4,-5}; 
		int result1;
		int result2;
		int len = numbers.length;
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		result1 = numbers[0]*numbers[1];
		result2 = numbers[len - 1] * numbers[len - 2];
		if(result1 > result2) {
			System.out.println(result1);
		} else {
			System.out.println(result2);
		}
		System.out.println(result1);
	}

}
