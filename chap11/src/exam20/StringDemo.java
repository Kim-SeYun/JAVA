package exam20;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) {
		
		// ���ڿ� -> ����Ʈ�迭
		String str = "Hello Java";
		byte[] hello = str.getBytes();
		System.out.println(Arrays.toString(hello));
		
		// ����Ʈ �迭 -> ���ڿ�
		byte[] bytes1 = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		String str2 = new String(bytes1);
		System.out.println(str2);
		
		String str3 = new String(bytes1, 6, 4);
		System.out.println(str3);
		
		// ������ ���ڼ����� ���ڵ�
		try {
			String str4 = new String(bytes1, "utf-8");
			System.out.println(str4);
			String str5 = new String(bytes1, 6, 4, "utf-8");
			System.out.println(str5);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}

}
