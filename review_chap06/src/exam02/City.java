package exam02;

public class City {
	private String name;
	private String owner;
	private int price; // ���԰�
	private boolean isBuilding; // �ǹ� �Ǽ� ����
	private CityBuilding ownedBuilding; // ������ �ǹ�
	private int tax; // ���༼
	
	public City(String name, int price, boolean isBuilding) {
		this.name = name;
		this.price = price;
		this.isBuilding = isBuilding;
	}
	
	
	@Override
	public String toString() {
		
		return "�����̸� : " +name+ ", �ŸŰ� : " +price+ ", �ǹ��Ǽ����� : "+isBuilding;
	}
	
	public void setTax() {
		// �ǹ��� ���� ������ ��� : ����(2��), �׿�(1.2��)
		if(isBuilding==false) {
			tax = name.equals("����") ? price*2 : (int)(price*1.2);
			return;
		}
		
		// �ǹ��� ���� �� �ִ� ��� : 
		//�ǹ��� ���� ���(0.1��), 
		if(ownedBuilding==null) {
			tax = (int)(price*0.1);
			return;
		}
		
		//����(1.8��), ����(+60��), ȣ��(+100��)
		switch (ownedBuilding) {
		case VILLA:
			tax = (int)(price*0.8);
			break;
		case BUILDING:
			tax = price+600000;
			break;
		case HOTEL:
			tax = price+1000000;
			break;
		}
		
	}
	
	public int getTax() {
		return tax;
	}
	
	public void setOwnedBuilding(CityBuilding ownedBuilding) {
		this.ownedBuilding = ownedBuilding;
	}

}
