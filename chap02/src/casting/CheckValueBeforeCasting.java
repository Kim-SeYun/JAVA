package casting;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		
		int i = 128;
		
		// Byte.MIN_VALUE = -128
		// Byte.MAX_VALUE = 127
		// ���ǽ� : i < -128 �Ǵ�  i > 127
		if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			// byte ���� ������ �Ѿ� ����
			System.out.println("byte Ÿ������ ��ȯȰ �� �����ϴ�.");
		}else {
			// byte ���� ���� ���� ����
			byte b = (byte)i;
			System.out.println("b");
		}
		
	}

}
