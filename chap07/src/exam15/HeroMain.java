package exam15;

public class HeroMain {
	public static void main(String[] args) {
		Hero hero = new Hero("����");
		Sword s = new Sword("�ڿ��ϴ��");
		hero.setItem(s);
		hero.info();
		
		System.out.println("=====================");
		
		Spear spear = new Spear("��õȭ��");
		hero.setItem(spear);
		hero.info();
	}

}
