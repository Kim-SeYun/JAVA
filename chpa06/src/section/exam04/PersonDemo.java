package section.exam04;

public class PersonDemo {
	public static void main(String[] args) {
		// 기본생성자를 사용하여 객체 생성
		Person p1 = new Person();
		
		// 객체의 필드에 접근(참조변수.필드명)
		p1.id = 1;
		p1.name = "김철수";
		p1.ssn = "00000";
		p1.print();
		
		Person p2 = new Person("김민수", "1111");
		p2.id = 2;
		p2.print();
		
		Person p3 = new Person(3, "박명수", "2222");
		p3.print();
		
	}

}
