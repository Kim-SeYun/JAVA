package ref_type;

public class StringEqualsExample {
	
	public static void isRefEquals(String var1, String var2) {
		if(var1 ==var2) {
			System.out.println("�� ������ �������� ����");
			return;
		}
		System.out.println("�� ������ �������� �ٸ�");
	}

	public static void isValueEquals(String var1, String var2) {
		if(var1.equals(var2)) {
			System.out.println("�� ������ ���� ����");
			return;
		}
		System.out.println("�� ������ ���� �ٸ�");
	}
	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");
		
		System.out.print("strVar1, strVar2 : ");
		isRefEquals(strVar1, strVar2);
		System.out.print("strVar1, strVar2 : ");
		isValueEquals(strVar1, strVar2);
		
		System.out.print("strVar3, strVar4 : ");
		isRefEquals(strVar3, strVar4);
		System.out.print("strVar3, strVar4 : ");
		isValueEquals(strVar3, strVar4);
		
		
	}
}
