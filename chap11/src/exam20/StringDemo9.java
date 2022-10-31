package exam20;

public class StringDemo9 {
	public static void main(String[] args) {
		// 대소문자변경
		String str1 = "Java Programming";
		String str2 = "JAVA PROGRAMMING";
		// ctrl+shift+x : 대문자변경
		// ctrl+shift+y : 소문자변경
		
		String upperCase = str1.toUpperCase(); // 대문자로 변경
		String lowerCase = str2.toLowerCase(); // 소문자로 변경
		System.out.println(upperCase);
		System.out.println(lowerCase);
		
		// 대소문자 관계없이 동등비교
		System.out.println(str1.equalsIgnoreCase(str2));
		
		// 문자열 "ja"로 시작하는가
		System.out.println(str1.startsWith("ja")); 
		// 문자열 "ing"로 끝나는가
		System.out.println(str1.endsWith("ing"));
		
		// 앞뒤 공백제거
		String str3 = "   Java Programming    ";
		String trimStr3 = str3.trim();
		System.out.println(trimStr3);
		
	
	}
}
