package primitive;

public class PrimitiveTypeMaxAndMin {
	public static void main(String[] args) {
		System.out.println("byteŸ���� �ּڰ� : "+Byte.MIN_VALUE);
		byte minValue = -128;
		System.out.println("byteŸ���� �ִ� : "+Byte.MAX_VALUE);
		byte maxValue = 127;
		
		System.out.println((int)Character.MAX_VALUE); // ���� ����
		System.out.println((int)Character.MIN_VALUE); // ���� ����
		
		System.out.println("shortŸ�� �ִ� : "+Short.MAX_VALUE);
		System.out.println("shortŸ�� �ּڰ� : "+Short.MIN_VALUE);
		short maxShValue = 32767;
		short minShValue = -32768;
		
		System.out.println("int Ÿ�� �ִ� : "+Integer.MAX_VALUE);
		System.out.println("int Ÿ�� �ּڰ� : "+Integer.MIN_VALUE);
		
		System.out.println("float Ÿ�� �ִ� : "+Float.MAX_VALUE);
		System.out.println("float Ÿ�� �ּڰ� : "+Float.MIN_VALUE);
		
		
		System.out.println("double Ÿ�� �ִ� : "+Double.MAX_VALUE);
		System.out.println("double Ÿ�� �ּڰ� : "+Double.MIN_VALUE);
	}

}
