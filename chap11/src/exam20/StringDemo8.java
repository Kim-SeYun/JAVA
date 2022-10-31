package exam20;

public class StringDemo8 {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		// 인덱스 2번부터 끝까지
		String substring = ssn.substring(2);
		System.out.println(substring);
		
		// index 7 ~ 13(포함하지 않음)
		String substring2 = ssn.substring(7, 13);
		System.out.println(substring2);                           
	}

}
