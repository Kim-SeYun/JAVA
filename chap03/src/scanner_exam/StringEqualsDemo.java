package scanner_exam;

public class StringEqualsDemo {
	public static void main(String[] args) {
		String str1 = new String("ȫ�浿");
		String str2 = new String("ȫ�浿");
		System.out.println(str1==str2); // ������ �� : �����
		System.out.println(str1.equals(str2)); // ���ڿ����� �� �� : equals
		
		String str3 = "ȫ�浿"; // ��ü����
		String str4 = "ȫ�浿"; // ��ü���� �ƴ�
		String str5 = "ȫ�浿";
		System.out.println(str3==str4);
		System.out.println(str4==str5);
	}

}
