package exam04;

public class PeopleDemo {
	public static void main(String[] args) {
		// 자식객체를 생성하면 부모객체도 생성된다.
		// 자식클래스(서브, 하위) 생성자 호출 -> 부모(조상)클래스(슈퍼, 상위) 생성자 호출
//		Student st = new Student();
		//		Student st = new Student("박길동", "123456789");
		People st = new Student("박길동", "123456789", 10);
		st.printInfo();
	}

}
