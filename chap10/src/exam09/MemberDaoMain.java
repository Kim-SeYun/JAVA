package exam09;

import java.util.Scanner;

public class MemberDaoMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String choice = null;
		
		// DB����
		while(true) {
			System.out.println(">> DB���� : 1.����Ŭ | 2.MYSQL | 3.����");
			choice = scan.nextLine();
			if(choice.equals("1")) {
				// ����Ŭ "exam09.MemberDaoByOracle"
				choice = MemberDao.ORACLE_DB;
				break;
			} else if (choice.equals("2")) {
				// MYSQL "exam09.MemberDaoByMySQL"
				choice = MemberDao.MYSQL_DB;
				break;
			} else if (choice.equals("3")) {
				System.out.println("����");
				return ;
				// ����
			} else {
				System.out.println("�ٽ� �����ϼ���");
			}
		} // DB���� end
		
		
		try {
			Class<?> clazz = Class.forName(choice);
			MemberDao dao = (MemberDao) clazz.getDeclaredConstructor().newInstance();
			dao.selectAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}