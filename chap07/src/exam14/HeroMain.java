package exam14;

public class HeroMain {
	public static void main(String[] args) {
		Item i = new Item("��õȭ��", "���ݷ�");
		Hero h = new Hero("����", 10, i);
		h.printInfo();
		
		// Phone -> SmartPhone; (isA���� -> is kind of)
		// ����Ʈ���� ���̴�.
		// ���� ����Ʈ ���̴�.(���� ���� �Ұ�)
		// �ΰ��� �������̴�. (O)
		// �������� �ΰ��̴�. (X)
	}

}
