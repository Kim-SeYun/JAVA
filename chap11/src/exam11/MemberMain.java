package exam11;

import java.util.Objects;

public class MemberMain {
	public static void main(String[] args) {
		Member member1 = new Member("ȫ�浿");
		Member member2 = new Member("ȫ�浿");
		Member member3 = new Member("��浿");
		Member member4 = null;
		Member member5 = null;
		System.out.println(member1.equals(member2)); // true
		System.out.println(member2.equals(member3)); // false
		
		System.out.println(Objects.equals(member1,member2)); 
		
//		member4.equals(member1); // NullPointerException
		
		// null��ü�� null�� �ƴ� ��ü �� : false
		System.out.println(Objects.equals(member4, member1));
		
		// �� ��ü ��� null�� ��� true ��ȯ
		System.out.println(Objects.equals(member4, member5));
	}

}
