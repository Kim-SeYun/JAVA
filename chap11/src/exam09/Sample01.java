package exam09;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample01 {
	public static void main(String[] args) {
		List<Integer> sc = Arrays.asList(90,95,100,63,87,70);
		System.out.println(sc);
		
		// �������� ����
		Collections.sort(sc);
		System.out.println(sc);
		
		// ��������
		Collections.reverse(sc);
		System.out.println(sc);
		
		
	}

}
