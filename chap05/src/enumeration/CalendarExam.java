package enumeration;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		// ��ü���� : new ������ - main�ȿ��� �������
		String str = new String("ȫ�浿"); // ���ڿ� ��ü����
		
		// ������� �� ������ ���� �� : new �����ڸ� ���ؼ� ��ü���� �Ұ���
		Calendar now = Calendar.getInstance();
//		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println("���� : " + year);
		System.out.println("�� : " + month);
		System.out.println("�� : " + day);
		System.out.println("�ð� : " + hour);
		System.out.println("�� : " + minute);
		System.out.println("�� : " + second);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println("���� : " + week);
	}

}
