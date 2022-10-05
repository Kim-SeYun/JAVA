package enumeration;

public class WeekExam {
	public static void main(String[] args) {
		Week week = Week.SUNDAY;
		// name() : 이름
		String weekName = week.name();
		System.out.println(weekName); // name메소드 사용
		System.out.println(week); // 그냥 출력
		
		// ordinal() : 순번
		int weekOrdi = week.ordinal();
		System.out.println(weekOrdi);
		System.out.println(Week.FRIDAY.ordinal());
	}

}
