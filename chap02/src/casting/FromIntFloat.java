package casting;

public class FromIntFloat {
	public static void main(String[] args) {
		
		 //�Ǽ� Ÿ�� = �����κ� + �Ҽ��κ�
		// ���� Ÿ�� = �����κ�
		int num = 1234567890;
		int num2 = 1234567890;
		float num3 = num2; // int -> float
		num2 = (int) num3; // float -> int
		
		int result = num-num2;
		System.out.println(result);
	}

}
