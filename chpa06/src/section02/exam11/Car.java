package section02.exam11;

public class Car {
	private int speed;
	private boolean stop;
	
	public Car(int speed, boolean stop) {
		this.speed = speed;
		this.stop = stop;
	}
	void run() {
		System.out.println("~~~run~~~~");
	}
	
	// gatter ���� �޼ҵ�
	// �̸� �ʵ��� ù���� �빮�ڷ� ����
	// ���λ�� get�� ���� getSpeed
	// ���������� : public
	public int getSpeed() {
		return speed;
	}
	public boolean isStop() {
		return stop;
	}
	
	// setter
	public void setSpeed(int speed) {
		if(speed<0) {
			System.out.println("���� �� ���� �Ұ���");
			this.speed = 50;
			return;
		}
		if(speed>200) {
			System.out.println("200�ʰ� ����");
			this.speed = 200;
			return;
		}
		this.speed = speed;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

}
