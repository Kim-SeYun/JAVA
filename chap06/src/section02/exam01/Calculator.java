package section02.exam01;

public class Calculator {
	
	private boolean powerState;
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
		this.powerState = true;
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
		this.powerState = false;
	}
	
	int plus(int x, int y) {
		if(powerState) { // ������ �����ִٸ�
			return x + y;
		}
		System.out.println("������ Ű�� ����ϼ���.");
		return 0;
	}
	
	double divide(int x, int y) {
		if(powerState) {
			return (double)x/y;
		}
		System.out.println("������ ���� ����ϼ���.");
		return 0;
	}
	

}
