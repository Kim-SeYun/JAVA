package casting;

public class Example01 {
	public static void main(String[] args) {
		//자동타입변환(묵시적)
		byte value = 10; // 크기 1byte(작은상자) 
		int temp; //4byte(큰 상자)
		temp = value;
		
		// 강제타입변환(명시적)
		int v2 = 5; //큰 상자
		byte temp2; //작은상자
		temp2 = (byte) v2;
		
		// char : 2byte   byte : 1byte
		char test = (char) temp2;
		
		int intValue = 103029770;
		byte byteValue = (byte)intValue; // 명시적
		System.out.println(byteValue);
	}

}
