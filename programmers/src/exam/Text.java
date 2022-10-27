package exam;

import java.util.Arrays;

public class Text {
	public static void main(String[] args) {
		String str = "Bcad";
//		String[] arr = str.split("");
//		Arrays.sort(arr);
		str = str.toLowerCase();
		
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		str = new String(chars);
//		System.out.println(Arrays.toString(arr));
		System.out.println(str);
	}

}
