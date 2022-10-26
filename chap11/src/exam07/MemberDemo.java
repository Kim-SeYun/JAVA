package exam07;

public class MemberDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Member member = new Member(1, "ȫ�浿", "hong@example", true);
		
		Member member2 = member.getCloneMember();
		System.out.println(member2);
		
	}

}
