package sec01;

import java.util.ArrayList;
import java.util.List;

public class Sample04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		System.out.println(list);
		
		// 인덱스번호로 삭제
		list.remove(1);
		System.out.println(list);
		
		// 지정한 객체 삭제
		list.remove("apple");
		System.out.println(list);
		
		// 리스트가 비여있나
		System.out.println(list.isEmpty());

		// 리스트의 모든 객체 삭제
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list);
		
	}

}
