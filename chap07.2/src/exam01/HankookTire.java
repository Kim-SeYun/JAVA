package exam01;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accmulateRotation;
		if(accmulateRotation <= maxRotation) { // �ִ�ȸ������ ���� ���� ���
			System.out.print(location);
			System.out.print(" �ѱ�Ÿ�̾� ���� : ");
			System.out.println((maxRotation-accmulateRotation) + "ȸ");
			return true;
			
		} // �ִ�ȸ������ ���� ���
		System.out.print(location);
		System.out.println(" �ѱ�Ÿ�̾� ��ũ");
		return false;
	}
	
	

}
	
	


