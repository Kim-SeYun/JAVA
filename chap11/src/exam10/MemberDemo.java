package exam10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemberDemo {
	public static void main(String[] args) {
		List<Member> memberList = new ArrayList<Member>();
		memberList.add(new Member(21, "ȫ�浿"));
		memberList.add(new Member(12, "�ڱ浿"));
		memberList.add(new Member(34, "�̱浿"));
		memberList.add(new Member(17, "���浿"));
		
		Collections.sort(memberList);
		System.out.println(memberList);
	}

}
