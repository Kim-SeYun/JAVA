package sec01;

import java.util.ArrayList;

public class Sample02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("�ڹ�");
		list.add("����Ŭ");
		list.add("JSP");
		list.add("������");
		list.add("���ձ���");
		System.out.println(list);
		
		// �÷����� ũ��
		// Ÿ��ĳ��ƾ �ʿ����� �ʴ�.
		System.out.println("�÷����� ũ�� : " + list.size());
		String str = list.get(0);
//		list.add('a');
//		list.add(10);
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
