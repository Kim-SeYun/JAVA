package section.exam01;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student(); // s1�� �����ϴ� Student ��ü����
		Student s2 = new Student(); // s2�� �����ϴ� Student ��ü����
		System.out.println(s1==s2); // ������(�ּҰ�) ��
		System.out.println("s1�� ������ : " + s1);
		System.out.println("s2�� ������ : " + s2);
		
		s1.name = "�輼��";
		s1.age = 34;
		System.out.println(s1.name);
		System.out.println(s2.name);
	}

}
