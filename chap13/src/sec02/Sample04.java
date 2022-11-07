package sec02;

import java.util.ArrayList;
import java.util.List;

public class Sample04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("apple");
		list.add("orange");
		
		System.out.println(list);
		
		// 저장된 객체의 인덱스 반환 : 해당 객체가 없으면 -1 반환
		int idx1 = list.indexOf("apple"); // 0 왼쪽 -> 오른쪽 최초 발견 인덱스 반환
		int idx2 = list.indexOf("melon"); // -1
		System.out.println(idx1);
		System.out.println(idx2);
		
		int idx3 = list.lastIndexOf("apple"); // 오른쪽 -> 왼쪽
		System.out.println(idx3);
		
		// 객체가 포함되어 있는지 여부
		if(list.contains("apple")) {
			System.out.println("사과가 포함되어있음");
		}
		if(list.contains("melon")) {
			System.out.println("멜론이 포함되어있음");
		}else {
			System.out.println("멜론을 포함하지 않음");
		}
		
	}

}
