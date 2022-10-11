package exam03.test03;

import java.util.Arrays;

import exam03.test02.SmartPhone;

public class SmartPhoneDemo {
	public static void main(String[] args) {
		
		SmartPhone sm = new SmartPhone();
		sm.setPower(true);
		sm.makeAPhoneCall("01011113333");
		sm.appExecute("네이버");
		
		sm.appDownload("구글");
		sm.appDownload("계산기");
		System.out.println(sm.apps);
				
	}

}
