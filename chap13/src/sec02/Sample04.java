package sec02;

import java.util.ArrayList;
import java.util.List;

public class Sample04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("grape");
		list.add("banana");
		list.add("apple");
		list.add("orange");
		
		System.out.println(list);
		
		// ����� ��ü�� �ε��� ��ȯ : �ش� ��ü�� ������ -1 ��ȯ
		int idx1 = list.indexOf("apple"); // 0 ���� -> ������ ���� �߰� �ε��� ��ȯ
		int idx2 = list.indexOf("melon"); // -1
		System.out.println(idx1);
		System.out.println(idx2);
		
		int idx3 = list.lastIndexOf("apple"); // ������ -> ����
		System.out.println(idx3);
		
		// ��ü�� ���ԵǾ� �ִ��� ����
		if(list.contains("apple")) {
			System.out.println("����� ���ԵǾ�����");
		}
		if(list.contains("melon")) {
			System.out.println("����� ���ԵǾ�����");
		}else {
			System.out.println("����� �������� ����");
		}
		
	}

}
