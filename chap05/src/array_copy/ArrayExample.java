package array_copy;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		String[] oldStr = {"java", "mysql", "jsp", "oracle", "spring"};
		String[] newStr = new String[6];
		System.arraycopy(oldStr, 0, newStr, 0, oldStr.length);
		System.out.println(Arrays.toString(newStr));
		
		String[] newStr2 = new String[6];
		System.arraycopy(oldStr, 1, newStr2, 2, 3);
		System.out.println(Arrays.toString(newStr2));
		
		// ����� �迭�� ���� �迭�� ������ ��ü�� �����Ѵ�.
		System.out.println(oldStr[1] == newStr2[2]);
		System.out.println(oldStr[2] == newStr2[3]);
		System.out.println(oldStr[3] == newStr2[4]);
	}

}
