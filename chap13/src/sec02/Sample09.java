package sec02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Sample09 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("orange");
		
		
		// Consumer<? extends String>
		// String 또는 String 타입을 상속 (구현)한 클래스 타입
		// Consumer<? super String>
		// String 또는 String 타입의 상위클래스 또는 인터페이스
		// @FunctionalInterface : 추상메소드가 하나만 인터페이스, 람다식으로 표현할 수 있음
		
		Iterator<String> it = list.iterator();
		it.forEachRemaining(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t.length());
			}
		});
		// 익명구현객체
		it = list.iterator();
		it.forEachRemaining(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		//람다식
		System.out.println("============람다식==========");
		it = list.iterator();
		it.forEachRemaining(t -> System.out.println(t));
		
		// 메소드 참조
		System.out.println("============메소드 참조==========");
		it = list.iterator();
		it.forEachRemaining(System.out::println);
		
	}

}
