package exam03;

public class SmartPhoneMain1 {
	public static void main(String[] args) {
		Phone phone = new Phone(); // 스마트폰의 상위타입
//		SmartPhone sm = (SmartPhone) phone;
		
		Phone ph2 = new SmartPhone();
		
		SmartPhone sm2 = (SmartPhone) ph2;
		ph2.makeAPhoneCall();
		sm2.playApp("유튜브");
	}

}
