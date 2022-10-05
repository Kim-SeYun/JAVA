package casting;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		
		int i = 128;
		
		// Byte.MIN_VALUE = -128
		// Byte.MAX_VALUE = 127
		// 조건식 : i < -128 또는  i > 127
		if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			// byte 저장 범위를 넘어 선다
			System.out.println("byte 타입으로 변환활 수 없습니다.");
		}else {
			// byte 저장 범위 내에 있음
			byte b = (byte)i;
			System.out.println("b");
		}
		
	}

}
