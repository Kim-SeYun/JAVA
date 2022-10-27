package exam09;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample02 {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("홍길동", "박길동", "이길동", "나길동", "김길동");
		System.out.println(nameList);
		
		// 사전순서
		Collections.sort(nameList);
		System.out.println(nameList);
		
		// 역순정렬
		Collections.reverse(nameList);
		System.out.println(nameList);
		
		
		
	}

}
