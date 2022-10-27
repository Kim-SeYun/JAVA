package exam10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MemberMain2 {
	public static void main(String[] args) {
		// 정렬기준 익명구현 객체로 전달
		List<Member> memberList = new ArrayList<Member>();
		memberList.add(new Member(21, "홍길동"));
		memberList.add(new Member(12, "박길동"));
		memberList.add(new Member(34, "이길동"));
		memberList.add(new Member(17, "차길동"));
		
		// id기준 오름차순
		Collections.sort(memberList, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return o1.getId()-o2.getId();
			}
		});
		System.out.println(memberList);
		System.out.println();
		
		// id기준 내림차순
		Collections.sort(memberList, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return o2.getId()-o1.getId();
			}
		});
		System.out.println(memberList);
		
	}

}
