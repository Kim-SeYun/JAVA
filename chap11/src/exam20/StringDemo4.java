package exam20;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo4 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		// ���ڿ� -> ����Ʈ�迭 (���ڵ� ����)
		String str = "�ȳ��ϼ���";
		byte[] bytes = str.getBytes();
		byte[] bytes2 = str.getBytes("utf-8");
		byte[] bytes3 = str.getBytes("euc-kr");
		System.out.println(Arrays.toString(bytes2));
		System.out.println(Arrays.toString(bytes3));
		
		String decoStr1 = new String(bytes2);
		String decoStr2 = new String(bytes2, "utf-8");
		String decoStr3 = new String(bytes2, "euc-kr");
		System.out.println(decoStr1); // MS949 ���ڵ�
		System.out.println(decoStr2); // UTF-8 ���ڵ�
		System.out.println(decoStr3); // EUC-KR ���ڵ�
		
				
	}

}
