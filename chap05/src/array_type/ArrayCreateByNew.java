package array_type;

import java.util.Arrays;

public class ArrayCreateByNew {
	public static void main(String[] args) {
		int[] intArr = new int[4]; // [0 ,0 ,0, 0]
		intArr[0] = 10;
		intArr[1] = 5;
		intArr[2] = 9;
		intArr[3] = 11;
		System.out.println(Arrays.toString(intArr));
		
		// �迭�� �ε��� ������ �Ѵ� ���� �����ϸ� ���ܰ� �߻��Ѵ�.
//		intArr[4] = 100;
	}

}
