package sec02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Sample01 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("zz");
		list1.add("cc");
		list1.add("bb");
		System.out.println(list1);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("11");
		list2.add("22");
		list2.add("33");
		System.out.println(list2);
		
		// list�� �Ű������� �־��� �÷����� ��� ��� �߰�
		// �Ű����� Ÿ�� : Collection(List, Set)
		// Collection<? extends E>
		// ? : ���ϵ� ī��, Ÿ���Ķ���ͷ� �����̵� ������ �� �ִ�.
		// e : String Ÿ������ �����ȴ�.
		// Collection<? extends String>
		// ���ϵ� ī��� ���� �� �� �ִ� Ÿ�Ժ����� String �Ǵ� String���(����)Ÿ��
		list1.addAll(list2);
		System.out.println(list1);
		
		// Collection<? extends Number>
		// Collection<Number> : ����
		// Collection<Integer> : ����
		// Collection<Double> : ����
		// Collection<String> : ������ ����
		
		// ���ϴ� �ε��� ��ġ�� ��� �߰�
		List<String> list3 = new ArrayList<String>();
		list3.add("��");
		list3.add("��");
		list1.addAll(2, list3);
		System.out.println(list1);
	}

}
