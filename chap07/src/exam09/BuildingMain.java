package exam09;

public class BuildingMain {
	public static void main(String[] args) {
		Barracks b = new Barracks(2000, 10);
		b.setunitList();
		Factory f = new Factory(2500, 15);
		f.setunitList();
		System.out.println("���� ���� ������ ���� : "  + b.getunitList());
		System.out.println("�������� ���� ������ ���� : "  + f.getunitList());
		
	}

}





/*
 ���ֻ���ǹ�(GenBuilding)
 ������(hp)
 �Ǽ��ð�(buildTime)
 ���� ���� ���(unitList)
 
 ����(barrecks)
 ���갡�� ���� : marine(����), firebat(���̾��), ghost(��Ʈ)
 
 ��������(factory)
 ���갡�� ���� : vulture(��ó), tank(��ũ), goliath(�񸮾�)
 
 
 
 */