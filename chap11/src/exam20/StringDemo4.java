package exam20;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo4 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		// 문자열 -> 바이트배열 (인코딩 지정)
		String str = "안녕하세요";
		byte[] bytes = str.getBytes();
		byte[] bytes2 = str.getBytes("utf-8");
		byte[] bytes3 = str.getBytes("euc-kr");
		System.out.println(Arrays.toString(bytes2));
		System.out.println(Arrays.toString(bytes3));
		
		String decoStr1 = new String(bytes2);
		String decoStr2 = new String(bytes2, "utf-8");
		String decoStr3 = new String(bytes2, "euc-kr");
		System.out.println(decoStr1); // MS949 디코딩
		System.out.println(decoStr2); // UTF-8 디코딩
		System.out.println(decoStr3); // EUC-KR 디코딩
		
				
	}

}
