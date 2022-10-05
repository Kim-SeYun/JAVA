package scanner_exam;

public class StringEqualsDemo {
	public static void main(String[] args) {
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		System.out.println(str1==str2); // 참조값 비교 : 동등연산
		System.out.println(str1.equals(str2)); // 문자열에서 값 비교 : equals
		
		String str3 = "홍길동"; // 객체생성
		String str4 = "홍길동"; // 객체생성 아님
		String str5 = "홍길동";
		System.out.println(str3==str4);
		System.out.println(str4==str5);
	}

}
