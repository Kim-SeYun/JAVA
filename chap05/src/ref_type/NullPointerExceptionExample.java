package ref_type;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String Val1 = "ȫ�浿";
		String Val2 = "ȫ�浿";
		if(Val1 != null) {
			System.out.println(Val1.equals(Val2));
			
		}
		String str = null;
		int size = str.length(); 
		System.out.println(size);
		System.out.println("���� ����");
	}

}
