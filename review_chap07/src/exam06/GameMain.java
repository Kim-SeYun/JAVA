package exam06;

public class GameMain {
	public static void main(String[] args) {
		Hero hero = new Hero("관우");
		Sword sword = new Sword("무기1");
		Sword sword2 = new Sword("무기2");
		Spear p1 = new Spear("창1");
		Bow b1 = new Bow("활1");
		hero.setItem(b1);
		hero.info();
		
		
	}

}
