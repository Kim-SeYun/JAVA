package exam10;

import java.util.Comparator;

// Member 객체의 정렬 기준을 정의한 실체클래스
public class MemberAscById implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		// ID기준 오름차순 정렬
		// 오름차순 : 첫번째 매개값 - 두번째 매개값
		// 내림차순 : 두번쨰 매개값 - 첫번째 매개값
		return o2.getId()-o1.getId();
	}
	

}
