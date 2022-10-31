package exam20;

public class StringDemo5 {
	public static void main(String[] args) {
		String message = "문자열이 시작되는 인덱스를 반환한다.";
		int indexOf = message.indexOf("문자열");
		System.out.println(indexOf);
		int indexOf2 = message.indexOf("시작");
		System.out.println(indexOf2);
		
		// 문자열을 찾지 못하면 -1 반환
		int indexOf3 = message.indexOf("Hello");
		System.out.println(indexOf3);
	}

}
