package exam20;

public class StringDemo8 {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		// �ε��� 2������ ������
		String substring = ssn.substring(2);
		System.out.println(substring);
		
		// index 7 ~ 13(�������� ����)
		String substring2 = ssn.substring(7, 13);
		System.out.println(substring2);                           
	}

}
