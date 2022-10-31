package exam20;

import java.util.ArrayList;
import java.util.List;

public class StringDemo6 {
	public static void main(String[] args) {
		String message = "문자열 Java 시작 Java 인덱스를 Java 반환한다.";
		
		// 왼쪽에서 오른쪽으로 검색
		// 최초로 일치하는 문자열의 시작 인덱스 반환
		int indexOf = message.indexOf("Java");
		System.out.println(indexOf);
		int indexOf2 = message.indexOf("Java", 5);
		System.out.println(indexOf2);
		int indexOf3 = message.indexOf("Java", 13);
		System.out.println(indexOf3);
		
		List<Integer> list = new ArrayList<Integer>();
		int i = 0;
		do {
			int idx = message.indexOf("Java", i+1);
			if(idx != -1) {
				list.add(idx);
				
			}
			i = idx;
		} while(i != -1);
		System.out.println(list);
		
		// 오른쪽에서 왼쪽으로 검색
		int lastIndexOf = message.lastIndexOf("Java");
		System.out.println(lastIndexOf);
	}

}
