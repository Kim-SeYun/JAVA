package exam01;

public class DmbPhone extends Cellphone{
	
	int channel;
	
	public DmbPhone(String model, String color, int channel) {
		super(model,color);
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println("ä�� : " + channel + "�� ��ۼ���");
		
	}
	void turnOffDmb() {
		System.out.println("�������");
	}

}
