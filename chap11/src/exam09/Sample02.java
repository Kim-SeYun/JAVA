package exam09;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample02 {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("ȫ�浿", "�ڱ浿", "�̱浿", "���浿", "��浿");
		System.out.println(nameList);
		
		// ��������
		Collections.sort(nameList);
		System.out.println(nameList);
		
		// ��������
		Collections.reverse(nameList);
		System.out.println(nameList);
		
		
		
	}

}
