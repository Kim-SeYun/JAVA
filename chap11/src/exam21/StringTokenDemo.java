package exam21;

import java.util.StringTokenizer;

public class StringTokenDemo {
	public static void main(String[] args) {
		String str = "가/나/다/라/마/바/사";
		StringTokenizer st = new StringTokenizer(str, "/");
		
		while(st.hasMoreElements()) { // 반복한 요소가 있다면
			String token = st.nextToken(); // 가
			System.out.println(token);
			
		}
	}

}
