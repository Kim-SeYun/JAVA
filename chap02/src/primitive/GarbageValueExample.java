package primitive;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 127;
		var1++; // 1증가
		System.out.println(var1); // 쓰레기 값
		
		int value = 10;
		value++;
		++value;
		System.out.println(value);
		
		value--; // 1감소 - 11
		--value; // 10
		System.out.println(value);
	}

}
