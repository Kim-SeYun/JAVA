package section02.exam06;

public class Television2 {
	
	static String company;
	static String model;
	static String info;
	String color;
	
	static { // �������
		company = "�Ｚ";
		model = "LCD";
		info = company + "_" + model;
//		color = "red"; // ���� ��Ͽ����� �ν��Ͻ� ����(�ʵ�)�� ����� �� ����.
	}
	
	
	public static void main(String[] args) {
		System.out.println(Television2.company);
		System.out.println(model);
		System.out.println(info);
		
	}

}
