package exam20;

import java.util.ArrayList;
import java.util.List;

public class StringDemo6 {
	public static void main(String[] args) {
		String message = "���ڿ� Java ���� Java �ε����� Java ��ȯ�Ѵ�.";
		
		// ���ʿ��� ���������� �˻�
		// ���ʷ� ��ġ�ϴ� ���ڿ��� ���� �ε��� ��ȯ
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
		
		// �����ʿ��� �������� �˻�
		int lastIndexOf = message.lastIndexOf("Java");
		System.out.println(lastIndexOf);
	}

}
