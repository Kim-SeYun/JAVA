package exam20;

public class StringDemo7 {
	public static void main(String[] args) {
		String oldStr = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String replace = oldStr.replace("자바", "Java");
		System.out.println(replace);
		
		// str1을 수정하는 것이 아님, String 객체는 불변객체
		String str1 = "개발자과정";
		str1 += "자바"; // 새로운 객체 생성
		str1 += "오라클"; // 새로운 객체 생성
		str1 += "JSP"; // 새로운 객체 생성
		System.out.println(str1);
	}

}
