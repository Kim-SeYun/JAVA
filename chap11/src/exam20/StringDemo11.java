package exam20;

import java.util.Arrays;

public class StringDemo11 {
	public static void main(String[] args) {
		String str = "ȫ�浿&�̼�ȫ, �ڿ���, ���ڹ�-�ָ�ȣ&��浿";
		String[] split = str.split("&|,|-");
		System.out.println(Arrays.toString(split));
		
		String str2 = "abcdefg";
		String[] split2 = str2.split("");
		System.out.println(Arrays.toString(split2));
		
		String str3 = "01 0123 345 335 111 551";
		String[] split3 = str3.split(" ");
		System.out.println(Arrays.toString(split3));
		
		String str4 = "abcACgsgKJfg1235646";
		String[] split4 = str4.split("[a-z]");
		System.out.println(Arrays.toString(split4));
	}

}
