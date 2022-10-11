package exam01;

public class DmbPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmbcellPhone = new DmbCellPhone("자바폰", "검정", 10);
		System.out.println("모델 : " + dmbcellPhone.model);
		System.out.println("색상 : " + dmbcellPhone.color);
		
		dmbcellPhone.powerOn();
		dmbcellPhone.bell();
		dmbcellPhone.sendVoice("여보세요");
		dmbcellPhone.receiveVoice("안녕하세요! 저는 홍길동입니다.");
		dmbcellPhone.sendVoice("반갑습니다.");
		dmbcellPhone.hangUp();
		
		dmbcellPhone.turnOnDmb();
		dmbcellPhone.changeChannelDmb(12);
		dmbcellPhone.turnOffDmb();
	}

}
