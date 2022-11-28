package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KsCount {
	public static void main(String[] args) {
		int i = 10;
		int j = 50;
		int k = 5;
		String s = "";
		int count = 0;
		String d = Integer.toString(k); 
		for(int b=i; b<=j; b++) {
			s+=b;
		}
		System.out.println(s);
		String[] arr = s.split("");
		System.out.println(Arrays.toString(arr));
		for(int b=0; b<arr.length; b++) {
			if(arr[b].equals(d)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
