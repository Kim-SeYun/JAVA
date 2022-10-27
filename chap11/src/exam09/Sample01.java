package exam09;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample01 {
	public static void main(String[] args) {
		List<Integer> sc = Arrays.asList(90,95,100,63,87,70);
		System.out.println(sc);
		
		// 오름차순 정렬
		Collections.sort(sc);
		System.out.println(sc);
		
		// 역순정렬
		Collections.reverse(sc);
		System.out.println(sc);
		
		
	}

}
