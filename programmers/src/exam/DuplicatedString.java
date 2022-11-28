package exam;

import java.util.Arrays;

public class DuplicatedString {
	public static void main(String[] args) {
		String my_string = "people";
		String result = "";
		
		for(int i=0; i<my_string.length(); i++) {
			if(my_string.indexOf(my_string.charAt(i))==i) {
				result += my_string.charAt(i);
			}
		}
		System.out.println(result);
	}
	
}


//		String[] str = my_string.split("");
//		System.out.println(Arrays.toString(str));
//		String[] arr = Arrays.stream(str).distinct().toArray(String[]::new);
//		System.out.println(Arrays.toString(arr));
				
