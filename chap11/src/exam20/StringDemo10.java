package exam20;

public class StringDemo10 {
	public static void main(String[] args) {
		String str1 = 10 + "";
		String valueOf1 = String.valueOf(10);
		
		String str2 = 10.5 + "";
		String valueOf2 = String.valueOf(10.5);

		String str3 = 10.5f + "";
		String valueOf3 = String.valueOf(10.5f);
		
		String str4 = true + "";
		String valueOf4 = String.valueOf(true);
		
		String str5 = '��' +"";
		String valueOf5 = String.valueOf(str5);
		
		String test = " "; // ���鹮��
		System.out.println(test.isEmpty()); // ���鹮�ڸ� ��ҷ� ������
		System.out.println(test.isBlank()); // ���鹮�ڸ� ��ҷ� �������� ����
		
	}

}
