package exam13;

public class MemberMain {
	public static void main(String[] args) {
		Member member = new Member("홍길동", null);
		System.out.println(member);
		printInfo(member);
	}

	private static void printInfo(Member member) {
		System.out.println("이름 : " + member.getName());
		System.out.println("주소 : " + member.getAddress().getState()); // 예외발생
		
	}
	
	

}
