package exam10;

import java.util.Comparator;

// Member ��ü�� ���� ���� ���� : ��������
public class MemberDescById implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		return o2.getId()-o1.getId();
	}
	

}
