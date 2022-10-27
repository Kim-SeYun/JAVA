package exam11;

import java.util.Arrays;
import java.util.Objects;

public class DeepEqualsMain {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] arr2 = {1,2,3};
		int[] arr3 = {1,2};
		
		System.out.println(Arrays.equals(arr, arr2)); // 요소값 비교
		System.out.println(Objects.equals(arr, arr2)); // 참조값 비교
		System.out.println(Objects.deepEquals(arr, arr2)); // 요소값 비교
		
		
	}

}
