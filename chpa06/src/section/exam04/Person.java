package section.exam04;

public class Person {
	// Ŭ���� ��� : �ʵ�(����), ������, �޼ҵ�
	
	// �ʵ�
	String nation;
	int id;
	String name;
	String ssn;
	
	// �⺻ ������
	public Person() {
		
	}
	
	// ������ : �Ű����� 2��
	public Person(String name, String ssn) {
		nation = "���ѹα�";
		this.name = name;
		this.ssn = ssn;
		
	}
	// ������ : �Ű����� 3��
	public Person(int id, String name, String ssn) {
		nation = "���ѹα�";
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		
	}
	
	// �޼ҵ�
	void print() {
		System.out.println("id : " + id);
		System.out.println("�̸� : " + name);
		System.out.println("�ֹι�ȣ : " + ssn + "\n");
	}
	
}
