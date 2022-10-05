package enumeration;

public class WeekMain {
	public static void main(String[] args) {
		Week today; // 열거타입 선언
		today = Week.MONDAY; // 열거 상수 할당
		// today 스택영역
		// Week.MONDAY 메소드 영역(공유)
		// MONDAY 열거객체 (힙영역)
		
		Week birthday = null; // 참조타입이여서 null값 할당 가능
		System.out.println(today);
		
		// 열거 객체 비교
		Week day1 = Week.MONDAY; // 1
		Week day2 = Week.WEDNESDAY; // 3
		
		// 상대적 위치 인수(기준)
		// day1은 day2를 기준으로 어디에 위치해있는가
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1); // -2
		System.out.println(result2); // 2
	
	}

}
