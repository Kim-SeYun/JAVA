package enumeration;

public class WeekExam {
	public static void main(String[] args) {
		Week week = Week.SUNDAY;
		// name() : �̸�
		String weekName = week.name();
		System.out.println(weekName); // name�޼ҵ� ���
		System.out.println(week); // �׳� ���
		
		// ordinal() : ����
		int weekOrdi = week.ordinal();
		System.out.println(weekOrdi);
		System.out.println(Week.FRIDAY.ordinal());
	}

}
