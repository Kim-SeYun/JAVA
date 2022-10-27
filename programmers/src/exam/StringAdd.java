package exam;

import java.util.Arrays;

public class StringAdd {
	public static void main(String[] args) {
		String my_string = "aAb1B2vV34oOp";
		int sum =0;
		String str = my_string.replaceAll("[^0-9]", "");
		System.out.println(str);
		String[] a = str.split("");
		System.out.println(Arrays.toString(a));
		int[] num = new int[a.length];
		for(int i=0; i<a.length; i++) {
			num[i] = Integer.parseInt(a[i]);
		}
		System.out.println(Arrays.toString(num));
		for(int i=0; i<a.length; i++) {
			sum += num[i];
		}
		System.out.println(sum);
		

	}

}
