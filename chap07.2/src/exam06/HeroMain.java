package exam06;

public class HeroMain {
	public static void main(String[] args) {
		Hero hero = new Hero(200, 100);
		System.out.println(hero);
		for (int i = 0; i < 6; i++) {
			
			hero.usePothion(new HealPotion());
			System.out.println(hero);
			
			
		}
	}

}
