package primitive;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 127;
		var1++; // 1����
		System.out.println(var1); // ������ ��
		
		int value = 10;
		value++;
		++value;
		System.out.println(value);
		
		value--; // 1���� - 11
		--value; // 10
		System.out.println(value);
	}

}
