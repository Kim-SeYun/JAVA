package exam09;

public class Television {
	
	static String company = "Samsung";
	static String model = "LOD";
	static String info;
	String color;
	
	public Television(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "���� : " + color;
	}

	// �ν��Ͻ� �޼ҵ�
	void methodA() {
		System.out.println("methodA");
		System.out.println(this);
	}
	
	static {
		info = model + company;
		// �ν��Ͻ��ʵ� �ʱ�ȭ �ȵ�.
		// ��ü  ������ ������ ����
//		color = "����";
//		methodA();
	}
	
	public Television() {
//		info = company + model;
		// ����ƽ ��� : ������ ��밡��
		// �ν��Ͻ� ��� : ��ü�� ������ �Ǿ�� ��밡��
		// ������ ������ �ν��Ͻ� ��� ���
		// ������ - ��ü ����
	}

}