package exam10;

import java.util.Comparator;

// Member ��ü�� ���� ������ ������ ��üŬ����
public class MemberAscById implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		// ID���� �������� ����
		// �������� : ù��° �Ű��� - �ι�° �Ű���
		// �������� : �ι��� �Ű��� - ù��° �Ű���
		return o2.getId()-o1.getId();
	}
	

}
