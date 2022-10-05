package enumeration;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		// 객체생성 : new 연산자 - main안에서 만들어짐
		String str = new String("홍길동"); // 문자열 객체생성
		
		// 만들어진 것 가져다 쓰는 것 : new 연산자를 통해서 객체생성 불가능
		Calendar now = Calendar.getInstance();
//		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println("연도 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + day);
		System.out.println("시간 : " + hour);
		System.out.println("분 : " + minute);
		System.out.println("초 : " + second);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일 : " + week);
	}

}
