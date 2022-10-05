package scanner_exam;

public class StringConcatExample {
	public static void main(String[] args) {
		
		String str1 = "JDK" + 3 + 3.0;
		// ¹®ÀÚ¿­ + ¼ýÀÚ = ¹®ÀÚ¿­
		String str2 = 3 + 3.0 + "JDK";
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		System.out.println("µ¡¼À°á°ú : " + (10+2));
		System.out.println("°ö¼À°á°ú : " + 10*2);
	}

}
