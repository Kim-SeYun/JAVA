package enumeration;

import java.util.Arrays;
import java.util.Iterator;

public class EnumMethodExample2 {
	public static void main(String[] args) {
		
		Week weekDay = Week.valueOf("SUNDAY");
		if(weekDay == Week.SUNDAY || weekDay == Week.SATURDAY) {
			System.out.println("�ָ��̱���.");
		}else {
			System.out.println("�����̱���.");
		}
		
		// values() ��� ���Ű�ü�� �迭�� ����
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		

		
	}

}
