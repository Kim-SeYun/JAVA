package exam01;

import java.util.Arrays;

public class ArraysExample {
	public static void main(String[] args) {
		String[] arr = {"b", "a", "f", "d"};
		String[] strArr = {"b", "a", "f", "d"};
		String[][] arr2 = {
				{"1", "2", "3"},
				{"4", "5"}
		};
		String[][] arr3 = {
				{"1", "2", "3"},
				{"4", "5"}
		};
		System.out.println(arr); // ������
		System.out.println(Arrays.toString(arr)); // �迭�� ���
		
		System.out.println(arr2); // ������
		System.out.println(Arrays.toString(arr2)); // ������
		System.out.println(Arrays.deepToString(arr2)); // 2�����迭�� ���
		
		System.out.println(arr == strArr);
		System.out.println(arr.equals(strArr));
		System.out.println(Arrays.equals(strArr, arr));
		System.out.println(Arrays.deepEquals(arr2, arr3));
	}

}
