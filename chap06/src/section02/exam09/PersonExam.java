package section02.exam09;

public final class PersonExam {
	public static void main(String[] args) {
		// final이 가능한 곳 : 필드(재할당불가능), 클래스(상속불가능)
		
		Person person = new Person();
		person.name = "홍길동";
		
		// final 필드 재할당 불가능
//		person.nation = "미국";
//		person.ssn = "러시아";
		
		Person person2 = new Person("러시아", "0000");
		person2.name = "푸틴";
//		person2.nation = "영국";
//		person2.ssn = "1212121";
	}

}
