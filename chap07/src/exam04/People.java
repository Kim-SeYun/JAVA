package exam04;

public class People {
//	public People() {
//		System.out.println("People ������ ȣ��");
//	}
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	void printInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("�ֹι�ȣ : " + ssn);
	}

}

class Student extends People{
//	public Student() {
//		super(); // �θ� ������ ȣ��(��������)
//		System.out.println("Student ������ ����");
//	}
	
	int studentNo;
	
	public Student() {
		super("ȫ�浿", "1234");
	}
	
	public Student(String name, String ssn) {
	super(name, ssn);	
	}
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
		}
	
	void printInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("�ֹι�ȣ : " + ssn);
		System.out.println("�л���ȣ : " + studentNo);
	}

}
