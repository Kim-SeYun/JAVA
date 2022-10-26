package exam08;

public class MemberDemo {
	public static void main(String[] args) {
		Member member1 = new Member(1, "홍길동", "hong@example", true);
		System.out.println(member1);
		Address addr = new Address("서울특별시", "성북구", "12345");
		member1.setAddress(addr);
		
		System.out.println(member1);
		System.out.println(member1.getAddress().getState());
		System.out.println(member1.getAddress().getCity());
		System.out.println(member1.getAddress().getZip());
	}

}
