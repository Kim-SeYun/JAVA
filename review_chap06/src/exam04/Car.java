package exam04;

public class Car{
	
	String name;
	String company;
	
	// �ٸ�������(�Ű������� �ִ� ������)�� ������ �����Ͻ� �����Ϸ��� �⺻�����ڸ� �߰��Ѵ�.
	
	public Car() {
		super(); // �θ������ ȣ��
		// ���⼭ CarŬ������ �θ� : Object
	}
	
	public Car(String name) {
		this.name = name;
	}
	
	public Car(String name, String company) {
		this.name = name;
		this.company = company;
	}

	public static void main(String[] args) {
		Car car = new Car(); // �⺻������ ȣ��
		
	}

}
