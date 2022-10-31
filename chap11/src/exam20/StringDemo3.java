package exam20;

public class StringDemo3 {
	public static void main(String[] args) {
		String str = "가나다라마바사";
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println("====================");
		char charAt = str.charAt(0);
		System.out.println(charAt);
	}

}
