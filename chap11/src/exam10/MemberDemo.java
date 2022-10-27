package exam10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemberDemo {
	public static void main(String[] args) {
		List<Member> memberList = new ArrayList<Member>();
		memberList.add(new Member(21, "홍길동"));
		memberList.add(new Member(12, "박길동"));
		memberList.add(new Member(34, "이길동"));
		memberList.add(new Member(17, "차길동"));
		
		Collections.sort(memberList);
		System.out.println(memberList);
	}

}
