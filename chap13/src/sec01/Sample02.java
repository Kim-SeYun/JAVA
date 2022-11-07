package sec01;

import java.util.ArrayList;

public class Sample02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("자바");
		list.add("오라클");
		list.add("JSP");
		list.add("스프링");
		list.add("통합구현");
		System.out.println(list);
		
		// 컬렉션의 크기
		// 타입캐스틴 필요하지 않다.
		System.out.println("컬렉션의 크기 : " + list.size());
		String str = list.get(0);
//		list.add('a');
//		list.add(10);
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
