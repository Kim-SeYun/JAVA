package exam09;

import java.util.Scanner;

public class MemberDaoMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String choice = null;
		
		// DB선택
		while(true) {
			System.out.println(">> DB선택 : 1.오라클 | 2.MYSQL | 3.종료");
			choice = scan.nextLine();
			if(choice.equals("1")) {
				// 오라클 "exam09.MemberDaoByOracle"
				choice = MemberDao.ORACLE_DB;
				break;
			} else if (choice.equals("2")) {
				// MYSQL "exam09.MemberDaoByMySQL"
				choice = MemberDao.MYSQL_DB;
				break;
			} else if (choice.equals("3")) {
				System.out.println("종료");
				return ;
				// 종료
			} else {
				System.out.println("다시 선택하세요");
			}
		} // DB선택 end
		
		
		try {
			Class<?> clazz = Class.forName(choice);
			MemberDao dao = (MemberDao) clazz.getDeclaredConstructor().newInstance();
			dao.selectAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}