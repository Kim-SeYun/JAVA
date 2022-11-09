package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IndexChange {
	public static void main(String[] args) {
		String str = "hello";
		int num1 = 1;
		int num2 = 2;
		
		String[] arr = str.split("");
		System.out.println(Arrays.toString(arr));
		ArrayList list = new ArrayList(Arrays.asList(arr));
		System.out.println(list.toString());
		Collections.swap(list, num1, num2);
		System.out.println(list);
		String text = String.join("", list);
		System.out.println(text);
		
	}

}
