package exam10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemberMain {
	public static void main(String[] args) {
		List<Member> memberList = new ArrayList<Member>();
		memberList.add(new Member(21, "홍길동"));
		memberList.add(new Member(12, "박길동"));
		memberList.add(new Member(34, "이길동"));
		memberList.add(new Member(17, "차길동"));

		// 정렬 전 출력
		System.out.println(memberList);
		System.out.println("======================");
		
		// 오름차순 정렬
		// @param1 : 정렬 대상 컬렉션, @param2 : 정렬기준
		Collections.sort(memberList, new MemberAscById());
		System.out.println(memberList);
		
		System.out.println("========================");
		Collections.sort(memberList, new MemberDescById());
		System.out.println(memberList);
	}
	
	
}
