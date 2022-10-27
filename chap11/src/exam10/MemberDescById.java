package exam10;

import java.util.Comparator;

// Member 객체의 정렬 기준 정의 : 내림차순
public class MemberDescById implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		return o2.getId()-o1.getId();
	}
	

}
