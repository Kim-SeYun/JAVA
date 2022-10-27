package exam10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MemberMain3 {
	public static void main(String[] args) {
		// ���ı��� �͸��� ��ü�� ����
				List<Member> memberList = new ArrayList<Member>();
				memberList.add(new Member(21, "ȫ�浿"));
				memberList.add(new Member(12, "�ڱ浿"));
				memberList.add(new Member(34, "�̱浿"));
				memberList.add(new Member(17, "���浿"));
				
				// id���� �������� - ���ٽ� ��ȯ
				Collections.sort(memberList, (o1, o2) -> 
					o1.getId()-o2.getId()
					
				);
				System.out.println(memberList);
				System.out.println();
				
				// id���� �������� - ���ٽ� ��ȯ
				Collections.sort(memberList, (a,b) -> b.getId() - a.getId());
				System.out.println(memberList);
	}

}
