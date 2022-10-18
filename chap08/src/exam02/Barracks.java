package exam02;

// ���갡��, ��������, ������ ����

public class Barracks extends Building implements Generatable, Repareable, Liftable{
	
	public static final int MAX_HP = 1500;
	private boolean isLiftState = false;

	public Barracks(int hp, int buildTime) {
		super(hp, buildTime);
		
	}

	@Override
	public void setHp(int hp) {
		this.hp = hp > MAX_HP ? MAX_HP : hp;
		
	}

	@Override
	public void lift() {
		// true : �̷�����
		// false : ��������
		String message = isLiftState ? "�ǹ��� �����ϴ�" : "�ǹ��� ���ø��ϴ�.";
		this.isLiftState = !isLiftState;
		System.out.println(message);
	}

	@Override
	public void move() {
		if(isLiftState) {
			System.out.println("�ǹ��� �̵��մϴ�.");
			return;
		}
		System.out.println("���� �ǹ��� �̵��� �� �����ϴ�.");
	}

	@Override
	public void repare() {
		System.out.println("���� �ǹ��� �����մϴ�.");
	}

	@Override
	public void generateUnit() {
		System.out.println("���� ������ �����մϴ�.");
	}

}
