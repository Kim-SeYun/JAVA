package exam12;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MemberMain {
	public static void main(String[] args) {
		Member m1 = new Member(1, "ȫ�浿");
		Member m2 = new Member(1, "ȫ�浿");
		Member m3 = new Member(1, "ȫ�浿");
		
		// ���� ����
		System.out.println(Objects.equals(m1, m2));
		
		// �ؽ��ڵ� ���
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		
		Map<Member, String> map = new HashMap<>();
		map.put(m1, "ȫ�浿 ��ü");
		System.out.println(map.get(m1));
		System.out.println(map.get(m2));
	}
	

}
