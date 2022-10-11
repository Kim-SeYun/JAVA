package section.exam04;

public class Person {
	// 클래스 멤버 : 필드(변수), 생성자, 메소드
	
	// 필드
	String nation;
	int id;
	String name;
	String ssn;
	
	// 기본 생성자
	public Person() {
		
	}
	
	// 생성자 : 매개변수 2개
	public Person(String name, String ssn) {
		nation = "대한민국";
		this.name = name;
		this.ssn = ssn;
		
	}
	// 생성자 : 매개변수 3개
	public Person(int id, String name, String ssn) {
		nation = "대한민국";
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		
	}
	
	// 메소드
	void print() {
		System.out.println("id : " + id);
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + ssn + "\n");
	}
	
}
