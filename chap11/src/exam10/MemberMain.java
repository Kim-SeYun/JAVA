package exam10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemberMain {
	public static void main(String[] args) {
		List<Member> memberList = new ArrayList<Member>();
		memberList.add(new Member(21, "ȫ�浿"));
		memberList.add(new Member(12, "�ڱ浿"));
		memberList.add(new Member(34, "�̱浿"));
		memberList.add(new Member(17, "���浿"));

		// ���� �� ���
		System.out.println(memberList);
		System.out.println("======================");
		
		// �������� ����
		// @param1 : ���� ��� �÷���, @param2 : ���ı���
		Collections.sort(memberList, new MemberAscById());
		System.out.println(memberList);
		
		System.out.println("========================");
		Collections.sort(memberList, new MemberDescById());
		System.out.println(memberList);
	}
	
	
}
