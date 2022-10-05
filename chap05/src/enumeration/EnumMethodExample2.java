package enumeration;

import java.util.Arrays;
import java.util.Iterator;

public class EnumMethodExample2 {
	public static void main(String[] args) {
		
		Week weekDay = Week.valueOf("SUNDAY");
		if(weekDay == Week.SUNDAY || weekDay == Week.SATURDAY) {
			System.out.println("주말이군요.");
		}else {
			System.out.println("평일이군요.");
		}
		
		// values() 모든 열거객체를 배열로 리턴
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		

		
	}

}
