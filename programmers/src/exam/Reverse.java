package exam;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		
		String s = "jaron";
		
		String str = "";
		String[] a = s.split("");
		System.out.println(Arrays.toString(a));
		for(int i=a.length-1; i>=0; i--) {
			
				str += a[i];
		}
		
		
		
//		for(int i=s.length()-1; i>=0; i--){
//			str += s.charAt(i);
//		}
		System.out.println(str);
	}

}
