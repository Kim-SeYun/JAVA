package exam01;

public class Tire {
	int maxRotation; // �ִ� ȸ����
	int accmulateRotation; // ���� ȸ����
	String location; // Ÿ�̾� ��ġ
	
	public Tire(String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() {
		++accmulateRotation;
		if(accmulateRotation <= maxRotation) { // �ִ�ȸ������ ���� ���� ���
			System.out.print(location);
			System.out.print(" Tire ���� : ");
			System.out.println((maxRotation-accmulateRotation) + "ȸ");
			return true;
			
		} // �ִ�ȸ������ ���� ���
		System.out.print(location);
		System.out.println(" Tire ��ũ");
		return false;
	}

}