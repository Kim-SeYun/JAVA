package exam20;

public class StringDemo5 {
	public static void main(String[] args) {
		String message = "���ڿ��� ���۵Ǵ� �ε����� ��ȯ�Ѵ�.";
		int indexOf = message.indexOf("���ڿ�");
		System.out.println(indexOf);
		int indexOf2 = message.indexOf("����");
		System.out.println(indexOf2);
		
		// ���ڿ��� ã�� ���ϸ� -1 ��ȯ
		int indexOf3 = message.indexOf("Hello");
		System.out.println(indexOf3);
	}

}
