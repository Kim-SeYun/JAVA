package exam20;

public class StringDemo7 {
	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String replace = oldStr.replace("�ڹ�", "Java");
		System.out.println(replace);
		
		// str1�� �����ϴ� ���� �ƴ�, String ��ü�� �Һ���ü
		String str1 = "�����ڰ���";
		str1 += "�ڹ�"; // ���ο� ��ü ����
		str1 += "����Ŭ"; // ���ο� ��ü ����
		str1 += "JSP"; // ���ο� ��ü ����
		System.out.println(str1);
	}

}
