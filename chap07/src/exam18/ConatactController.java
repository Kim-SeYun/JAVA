package exam18;

import java.util.Scanner;

public class ConatactController {
	
	private ContactDaoByMySQL dao = new ContactDaoByMySQL();
	
	public void start() {
		Scanner in = new Scanner(System.in);
		System.out.println("0 : 프로그램 종료 | 1 : 연락처 목록 | 2 : 연락처 추가");
		
		while(true){
			System.out.print(">> 명령어 입력 : ");
			switch (in.next()) {
			case "0":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); // 메인스레드 종료
				break;
			case "1":
				System.out.println("연락처 목록 보기");
				dao.contactList();
				break;
			case "2":
				System.out.println("연락처 추가");
				System.out.print(">> 이름입력 : ");
				String name = in.next();
				System.out.print(">> 연락처 입력 : ");
				String phoneNumber = in.next();
				dao.addContact(new Contact(name, phoneNumber));
				break;
	
			default:
				System.out.println("잘못된 입력입니다.");
				break;
		
			}
		}	
	}
		

}
