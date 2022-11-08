package sec03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample05 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		// 리스트 회전(양수 : 오른쪽, 음수 : 왼쪽)
		System.out.println(list);
		Collections.rotate(list, 1);
		System.out.println(list);
		
		Collections.rotate(list, -1);
		System.out.println(list);
		
		// 두 요소의 위치바꾸기
		Collections.swap(list, 1, 4);
		System.out.println(list);
		
		// 임의로 섞기
		Collections.shuffle(list);
		System.out.println(list);
		
	}

}
