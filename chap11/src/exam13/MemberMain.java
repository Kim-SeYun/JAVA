package exam13;

public class MemberMain {
	public static void main(String[] args) {
		Member member = new Member("ȫ�浿", null);
		System.out.println(member);
		printInfo(member);
	}

	private static void printInfo(Member member) {
		System.out.println("�̸� : " + member.getName());
		System.out.println("�ּ� : " + member.getAddress().getState()); // ���ܹ߻�
		
	}
	
	

}
