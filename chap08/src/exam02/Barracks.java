package exam02;

// 생산가능, 수리가능, 리프팅 가능

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
		// true : 이륙상태
		// false : 착륙상태
		String message = isLiftState ? "건물을 내립니다" : "건물을 들어올립니다.";
		this.isLiftState = !isLiftState;
		System.out.println(message);
	}

	@Override
	public void move() {
		if(isLiftState) {
			System.out.println("건물을 이동합니다.");
			return;
		}
		System.out.println("아직 건물을 이동할 수 없습니다.");
	}

	@Override
	public void repare() {
		System.out.println("병영 건물을 수리합니다.");
	}

	@Override
	public void generateUnit() {
		System.out.println("병영 유닛을 생산합니다.");
	}

}
