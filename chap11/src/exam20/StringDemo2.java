package exam20;

import java.util.Arrays;

public class StringDemo2 {
	public static void main(String[] args) {
		// ���ڿ� -> char�迭
		String str = "Hello Java";
		char[] charArray = str.toCharArray();
		System.out.println(Arrays.toString(charArray));
		
		// char�迭 -> ���ڿ�
		char[] chArr = {'H', 'e', 'l', 'l', 'o', ' ','J', 'a', 'v', 'a'};
		String str2 = new String(chArr);
		System.out.println(str2);
		String str3 = new String(chArr, 6, 4);
		System.out.println(str3);
	}
}
