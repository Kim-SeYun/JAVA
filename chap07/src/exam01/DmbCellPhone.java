package exam01;

public class DmbCellPhone extends Cellphone{
	
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model; // Cellphone으로 상속받은 필드
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송을 수신합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널을 " + channel + "번으로 변경합니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 중단합니다.");
	}

}
