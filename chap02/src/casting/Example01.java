package casting;

public class Example01 {
	public static void main(String[] args) {
		//�ڵ�Ÿ�Ժ�ȯ(������)
		byte value = 10; // ũ�� 1byte(��������) 
		int temp; //4byte(ū ����)
		temp = value;
		
		// ����Ÿ�Ժ�ȯ(�����)
		int v2 = 5; //ū ����
		byte temp2; //��������
		temp2 = (byte) v2;
		
		// char : 2byte   byte : 1byte
		char test = (char) temp2;
		
		int intValue = 103029770;
		byte byteValue = (byte)intValue; // �����
		System.out.println(byteValue);
	}

}
