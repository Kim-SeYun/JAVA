package exam01;

public class DmbCellPhone extends Cellphone{
	
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model; // Cellphone���� ��ӹ��� �ʵ�
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ����� �����մϴ�.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä���� " + channel + "������ �����մϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ��� ������ �ߴ��մϴ�.");
	}

}
