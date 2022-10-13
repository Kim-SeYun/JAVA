package exam18;

import java.util.ArrayList;
import java.util.List;

public class ContactDaoByMySQL {
	
	private static List<Contact> list = new ArrayList<>();
	
	static {
		list.add(new Contact("����", "000000000"));
		list.add(new Contact("�ƺ�", "11111111"));
		list.add(new Contact("��", "22222222"));
		list.add(new Contact("����", "33333333"));
	}
	
	// ����ó �߰�
	public void addContact(Contact contact) {
		list.add(contact);
		
	}
	
	// ����ó ���
	public void contactList() {
		print();
	}
	
	public void print() {
		for(Contact c : list) {
			System.out.println("�̸� : " + c.getName() + " | ����ó : " + c.getPhoneNumber());
			
		}
	}

}