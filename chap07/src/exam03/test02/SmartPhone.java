package exam03.test02;

import exam03.test01.CellPhone;

public class SmartPhone extends CellPhone{
	
	private String[] apps;
	
	public SmartPhone() {
		apps = new String[10];
		apps[0] = "��Ʃ��";
		apps[1] = "�÷��̽����";
		apps[2] = "���̹�";
	}
	
	public void appExecute(String appName) { // ��Ʃ��
		if(!isPowerOn(this.power)) return; 
		for(String app : apps) {
			if(app != null && app.equals(appName)) {
				System.out.println(appName + "���� �����մϴ�.");
				return;
			}
		}
		System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
			
		}
		
}


