package exam06;

public class GameMain {
	public static void main(String[] args) {
		Hero hero = new Hero("包快");
		Sword sword = new Sword("公扁1");
		Sword sword2 = new Sword("公扁2");
		Spear p1 = new Spear("芒1");
		Bow b1 = new Bow("劝1");
		hero.setItem(b1);
		hero.info();
		
		
	}

}
