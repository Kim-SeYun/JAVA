package exam02;

// 업그레이드 가능, 수리 가능
public class Academy extends Building implements Upgradable, Repareable{
	
	public static final int MAX_HP = 600;
	
	public Academy(int hp, int buildTime) {
		super(hp, buildTime);
	}

	@Override
	public void setHp(int hp) {
		this.hp = hp > MAX_HP ? MAX_HP : hp;
	}

	@Override
	public void repare() {
		System.out.println("사관학교를 수리합니다.");
		
	}

	@Override
	public void upgrade(String upgrade) {
		System.out.println("업그레이드 : " + upgrade);
		
	}

}
