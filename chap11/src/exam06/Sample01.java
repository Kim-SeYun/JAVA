package exam06;

import java.util.Arrays;

public class Sample01 {
	public static void main(String[] args) {
		// ���� ����
		int[] arr = {1,2,3,4,5};
		int[] copyArr = arr;
//		System.out.println(Arrays.toString(copyArr));
		arr[0] = 100;
		System.out.println(Arrays.toString(copyArr));
		
		// ���� ����
		String[] strArr = {"a", "b", "c"};
		String[] copyStrArr = new String[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			copyStrArr[i] = strArr[i];
			
		}
		System.out.println(Arrays.toString(copyStrArr));
		strArr[0] = "��";
		// ������
		System.out.println(Arrays.toString(copyStrArr));
	}

}
