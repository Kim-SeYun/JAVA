package exam05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberDemo2 {
	public static void main(String[] args) {
		String[] strArr = {"ȫ�浿", "�ڱ浿", "���浿"};
		List<String> strList = Arrays.asList("ȫ�浿", "�ڱ浿", "���浿");
		System.out.println(strList);
		
		int[] intArr = {1, 2, 3, 4, 5};
		// int�� wrapper Ŭ���� : Integer
		// long�� wrapperŬ���� : Long
		// double�� wrapperŬ���� : Double
		
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		intList = new ArrayList<Integer>(intList);
		System.out.println(intList);
		
		// ����
		System.out.println("�迭�� ���� : " + intArr.length);
		System.out.println("����Ʈ�� ���� : " + intList.size());
		
		int[] result = new int[intList.size()];
		for (int i = 0; i < intList.size(); i++) {
			result[i] = intList.get(i); // intArr[i]
			
		}
		System.out.println(Arrays.toString(result));
		
		// ����
		intList.remove(2);
		System.out.println(intList); // [1, 2, 4, 5]
		result[2] = 0;
		System.out.println(Arrays.toString(result));
		
	}

}
