package operation;

public class Exam00 {
	public static void main(String[] args) {
		
		int value = 10;
		boolean r1 = !(value >10);
		// !(value>10)
		// value <= 10
		// 20 <= 10
		// false
		System.out.println(r1);
		
		boolean r2 = !(value >= 10 || value != 20);
		// !(20 >= 10 || 20 != 20)
		// !(true || false)
		// !(true)
		// false
		
		// !(value >= 10 || value != 20)  ��𸣰��� ��Ģ (A������B)������
		// value < 10 && value == 20
		// 20 < 10 && 20 == 20
		// false && true
		// false
		System.out.println(r2);
	}

}
