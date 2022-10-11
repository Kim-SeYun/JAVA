package exam04;

public class People {
//	public People() {
//		System.out.println("People 생성자 호출");
//	}
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + ssn);
	}

}

class Student extends People{
//	public Student() {
//		super(); // 부모 생성자 호출(생략가능)
//		System.out.println("Student 생성자 생성");
//	}
	
	int studentNo;
	
	public Student() {
		super("홍길동", "1234");
	}
	
	public Student(String name, String ssn) {
	super(name, ssn);	
	}
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
		}
	
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + ssn);
		System.out.println("학생번호 : " + studentNo);
	}

}
