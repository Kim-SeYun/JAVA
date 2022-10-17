package exam06;

public class HealPotion extends Potion{
	int recovery = 70;
	
	@Override
	public void recovery(Hero hero) {
		int hp = hero.getHp();
		int maxHp = hero.getMaxHp();
		if(hp == maxHp) { 
			System.out.println("더 이상 회복할 수 없습니다.");
			return;
		}
		hp += this.recovery;
		if(hp >= maxHp) { // 초과회복
			System.out.println("모든 생명력이 회복되었습니다.");
			hero.setHp(maxHp);
			return;
		}
		
		hero.setHp(hp);
	}
}
