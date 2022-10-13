package exam18;

import java.util.Scanner;

public class ConatactController {
	
	private ContactDaoByMySQL dao = new ContactDaoByMySQL();
	
	public void start() {
		Scanner in = new Scanner(System.in);
		System.out.println("0 : ���α׷� ���� | 1 : ����ó ��� | 2 : ����ó �߰�");
		
		while(true){
			System.out.print(">> ��ɾ� �Է� : ");
			switch (in.next()) {
			case "0":
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0); // ���ν����� ����
				break;
			case "1":
				System.out.println("����ó ��� ����");
				dao.contactList();
				break;
			case "2":
				System.out.println("����ó �߰�");
				System.out.print(">> �̸��Է� : ");
				String name = in.next();
				System.out.print(">> ����ó �Է� : ");
				String phoneNumber = in.next();
				dao.addContact(new Contact(name, phoneNumber));
				break;
	
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
		
			}
		}	
	}
		

}
