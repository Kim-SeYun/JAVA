package section.exam04;

public class PersonDemo {
	public static void main(String[] args) {
		// �⺻�����ڸ� ����Ͽ� ��ü ����
		Person p1 = new Person();
		
		// ��ü�� �ʵ忡 ����(��������.�ʵ��)
		p1.id = 1;
		p1.name = "��ö��";
		p1.ssn = "00000";
		p1.print();
		
		Person p2 = new Person("��μ�", "1111");
		p2.id = 2;
		p2.print();
		
		Person p3 = new Person(3, "�ڸ��", "2222");
		p3.print();
		
	}

}
