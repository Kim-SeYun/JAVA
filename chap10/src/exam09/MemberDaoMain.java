package exam09;

import java.util.Scanner;

public class MemberDaoMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String choice = null;
		
		// DB 선택
		while(true) {
			System.out.println(">>DB선택 : 1. 오라클 | 2. MYSQL | 3. 종료");
			choice = scan.nextLine();
			if(choice.equals("1")) {
				//오라클 "exam09.MemberDaoByOracle"
				choice = MemberDao.ORACLE_DB;
				break;
			}else if(choice.equals("2")) {
				// MYSQL "exam09.MemberDaoByMYSQL"
				choice = MemberDao.MYSQL_DB;
				break;
			}else if(choice.equals("0")) {
				// 종료
			
			}else {
				System.out.println("다시 시작하세요.");
			}
			
		} // DB 선택 종료
		try {
			Class<?> clazz = Class.forName(choice);
			MemberDao dao = (MemberDao) clazz.getDeclaredConstructor().newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
