package casting;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10; // 2byte ����
		int intValue = byteValue; // �ڵ�Ÿ�Ժ�ȯ byte-> int
		System.out.println(intValue);
		
		char charValue = '��'; // 2byte
		intValue = charValue; //���Ҵ� 44032 char -> int
		System.out.println(intValue);
		
		intValue = 500; // 4byte
		long longValue = intValue; // 8byte  int -> long
		System.out.println(longValue);
		
	}

}
