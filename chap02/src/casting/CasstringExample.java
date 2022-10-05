package casting;

public class CasstringExample {
	public static void main(String[] args) {
		// 정수타입 : int(4byte) -> char(2byte)
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		// 정수타입 : long(8byte) -> int(4byte)
		long longValue = 500;
		intValue = (int)longValue; // 데이터 손실
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; // 데이터 손실
		System.out.println(intValue);
		
	}

}
