package exam21;

import java.util.StringTokenizer;

public class StringTokenDemo {
	public static void main(String[] args) {
		String str = "��/��/��/��/��/��/��";
		StringTokenizer st = new StringTokenizer(str, "/");
		
		while(st.hasMoreElements()) { // �ݺ��� ��Ұ� �ִٸ�
			String token = st.nextToken(); // ��
			System.out.println(token);
			
		}
	}

}
