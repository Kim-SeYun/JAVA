package section02.exam07;

public class Card {
	int cardNumber; // ī�����(�ν��Ͻ�)
	static int cardwidth; // ���α���(����)
	static int cardHeight; // ���α���(����)
	
	public Card() {
		// ������� ��������� ��� ��� ����
		System.out.println(cardwidth); // ������� ���
		this.cardNumber = 8; //������ ��� ���
	}
	
	static {
		// ������� ��밡��
		cardwidth = 90;
		cardHeight = 95;
		// ����������� ����� �� ����.
//		cardNumber = 10;
//		getCardNumber();
	}
	
	// static �޼ҵ�
	static void infoCardSize() {
		// ���� ��� ��� ����
		System.out.println(cardwidth);
		System.out.println(cardHeight);
		getMessage();
		// ����������� ����� �� ����.
//		cardNumber = 10;
//		getCardNumber();
	}
	
	static void getMessage() {
		System.out.println("Hello");
	}
	
	// �ν��Ͻ� �޼ҵ�
	int getCardNumber() {
		// �������, ������ ��� ��� ��밡��
		getMessage(); // ���� �޼ҵ�
		cardNumber = 100; // �ν��Ͻ� �ʵ�
		cardwidth = 80; // ���� �ʵ�
		cardHeight = 40; // ���� �ʵ�
		return this.cardNumber;
	}
	
	public static void main(String[] args) {
		infoCardSize();
//		Card card = new Card();
//		int result = card.getCardNumber();
//		System.out.println(result);
	}

}



// �������
// - �����ʵ�
// -�����޼ҵ�
// - ��ü���� ���� �������(������ ��밡��)
//
// ���������(�ν��Ͻ� ���)
// -������
// - �ν��Ͻ� �ʵ�
// - �ν��Ͻ� �޼ҵ�
// - ��ü���� �Ŀ� ��밡��
//
// ���� ���(��ü���� ����x)
// - static ���
// - static �޼ҵ�
//
//
// ������ ���(��ü���� ����o)
// -������
// -�ν��Ͻ� �޼ҵ�


