package exam02;

import exam01.Cellphone;

public class SmartPhone extends Cellphone{
	void appExecute() {
		System.out.println("앱을 실행합니다.");
		powerOn(); //protected는 Cellphone을 상속받은 클래스 내에서만 사용가능
	}
	
	

}
