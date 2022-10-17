package exam06;

public class ManaPotion extends Potion{
	
	int recovery = 30;
	
	@Override
	public void recovery(Hero hero) {
		int mp = hero.getMp();
		mp += recovery;
		hero.setMp(mp);
	}

}
