package exam03;

public class SmartPhone extends Phone{
	// IsA ����
	// ����Ʈ���� ���̴�.
	// ����Ʈ���� ���� �� �����̴�.
	
	
	String[] apps  = {"������", "�÷��̽����", "īī����"};
	
	public void playApp(String appName) {
		for(String app : apps) {
			if(app.equals(appName))
				System.out.println(app + "���� �����մϴ�.");
		}
	}

}
