package exam;

import java.util.Arrays;


public class Exoplanet {
	public static void main(String[] args) {
		int age = 23;
		String answer = "";

		String str = Integer.toString(age);
		String[] arr = str.split("");
		System.out.println(Arrays.toString(arr));

		for(int i=0; i<arr.length; i++) {
			answer += (char)(97 + Integer.parseInt(arr[i]));
			
		}
		System.out.println(answer);
	}

}
