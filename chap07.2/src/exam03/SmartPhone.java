package exam03;

public class SmartPhone extends Phone{
	// IsA 관계
	// 스마트폰은 폰이다.
	// 스마트폰은 폰의 한 종류이다.
	
	
	String[] apps  = {"유투브", "플레이스토어", "카카오톡"};
	
	public void playApp(String appName) {
		for(String app : apps) {
			if(app.equals(appName))
				System.out.println(app + "앱을 실행합니다.");
		}
	}

}
