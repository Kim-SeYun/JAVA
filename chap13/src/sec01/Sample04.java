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
		
		// �ε�����ȣ�� ����
		list.remove(1);
		System.out.println(list);
		
		// ������ ��ü ����
		list.remove("apple");
		System.out.println(list);
		
		// ����Ʈ�� ���ֳ�
		System.out.println(list.isEmpty());

		// ����Ʈ�� ��� ��ü ����
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list);
		
	}

}
