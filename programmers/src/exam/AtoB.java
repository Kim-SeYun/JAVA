package exam;

import java.util.Arrays;

public class AtoB {
	public static void main(String[] args) {
		
		String before = "olleh";
		String after = "hello";
		int a =0;
		int b=0;
		int result = 0;

		for(int i=0; i<before.length(); i++) {
			a += before.charAt(i);
			b += after.charAt(i);
			result = (a==b)?1:0;
		}
		System.out.println(result);
    }
}
