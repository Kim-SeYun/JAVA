package exam02;

public class MemberDemo {
	public static void main(String[] args) {
		Member member1 = new Member(1, "ȫ�浿");
		Member member2 = new Member(1, "ȫ�浿");
		Member member3 = new Member(2, "ȫ�浿");
		
		// �������̵� �� : �񱳿����ڿ� equals�޼ҵ� �����ϰ� ������
		// �������̵� �� : equals�޼ҵ� ���� ���� �Ǵ�
		System.out.println(member1==member2);
	
		// member1�� member2�� ���� ����O
		System.out.println(member1.equals(member2));
		
		// member1�� member2�� ���� ����X
		System.out.println(member1.equals(member3));
		
		
	}

}
