package exam20;

public class StringDemo9 {
	public static void main(String[] args) {
		// ��ҹ��ں���
		String str1 = "Java Programming";
		String str2 = "JAVA PROGRAMMING";
		// ctrl+shift+x : �빮�ں���
		// ctrl+shift+y : �ҹ��ں���
		
		String upperCase = str1.toUpperCase(); // �빮�ڷ� ����
		String lowerCase = str2.toLowerCase(); // �ҹ��ڷ� ����
		System.out.println(upperCase);
		System.out.println(lowerCase);
		
		// ��ҹ��� ������� �����
		System.out.println(str1.equalsIgnoreCase(str2));
		
		// ���ڿ� "ja"�� �����ϴ°�
		System.out.println(str1.startsWith("ja")); 
		// ���ڿ� "ing"�� �����°�
		System.out.println(str1.endsWith("ing"));
		
		// �յ� ��������
		String str3 = "   Java Programming    ";
		String trimStr3 = str3.trim();
		System.out.println(trimStr3);
		
	
	}
}
