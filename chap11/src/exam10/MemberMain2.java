package exam10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MemberMain2 {
	public static void main(String[] args) {
		// ���ı��� �͸��� ��ü�� ����
		List<Member> memberList = new ArrayList<Member>();
		memberList.add(new Member(21, "ȫ�浿"));
		memberList.add(new Member(12, "�ڱ浿"));
		memberList.add(new Member(34, "�̱浿"));
		memberList.add(new Member(17, "���浿"));
		
		// id���� ��������
		Collections.sort(memberList, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return o1.getId()-o2.getId();
			}
		});
		System.out.println(memberList);
		System.out.println();
		
		// id���� ��������
		Collections.sort(memberList, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return o2.getId()-o1.getId();
			}
		});
		System.out.println(memberList);
		
	}

}
