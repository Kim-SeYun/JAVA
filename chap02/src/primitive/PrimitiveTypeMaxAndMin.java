package primitive;

public class PrimitiveTypeMaxAndMin {
	public static void main(String[] args) {
		System.out.println("byteÅ¸ÀÔÀÇ ÃÖ¼Ú°ª : "+Byte.MIN_VALUE);
		byte minValue = -128;
		System.out.println("byteÅ¸ÀÔÀÇ ÃÖ´ñ°ª : "+Byte.MAX_VALUE);
		byte maxValue = 127;
		
		System.out.println((int)Character.MAX_VALUE); // °ø¹é ¹®ÀÚ
		System.out.println((int)Character.MIN_VALUE); // °ø¹é ¹®ÀÚ
		
		System.out.println("shortÅ¸ÀÔ ÃÖ´ñ°ª : "+Short.MAX_VALUE);
		System.out.println("shortÅ¸ÀÔ ÃÖ¼Ú°ª : "+Short.MIN_VALUE);
		short maxShValue = 32767;
		short minShValue = -32768;
		
		System.out.println("int Å¸ÀÔ ÃÖ´ñ°ª : "+Integer.MAX_VALUE);
		System.out.println("int Å¸ÀÔ ÃÖ¼Ú°ª : "+Integer.MIN_VALUE);
		
		System.out.println("float Å¸ÀÔ ÃÖ´ñ°ª : "+Float.MAX_VALUE);
		System.out.println("float Å¸ÀÔ ÃÖ¼Ú°ª : "+Float.MIN_VALUE);
		
		
		System.out.println("double Å¸ÀÔ ÃÖ´ñ°ª : "+Double.MAX_VALUE);
		System.out.println("double Å¸ÀÔ ÃÖ¼Ú°ª : "+Double.MIN_VALUE);
	}

}
