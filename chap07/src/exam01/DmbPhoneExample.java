package exam01;

public class DmbPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmbcellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		System.out.println("�� : " + dmbcellPhone.model);
		System.out.println("���� : " + dmbcellPhone.color);
		
		dmbcellPhone.powerOn();
		dmbcellPhone.bell();
		dmbcellPhone.sendVoice("��������");
		dmbcellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�Դϴ�.");
		dmbcellPhone.sendVoice("�ݰ����ϴ�.");
		dmbcellPhone.hangUp();
		
		dmbcellPhone.turnOnDmb();
		dmbcellPhone.changeChannelDmb(12);
		dmbcellPhone.turnOffDmb();
	}

}
