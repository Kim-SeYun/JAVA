package exam02;

public class GameMain {
	public static void main(String[] args) {
		Building b1 = new Barracks(1500, 1500);
		Generatable b2 = new Barracks(1500, 1500);
		
		Barracks b3 = (Barracks)b1;
		b3.move();
		b3.lift();
		b3.move();
		b3.lift();
		b3.generateUnit();
		
		System.out.println("========================");
		
		Upgradable ac = new Academy(600, 1000);
		ac.upgrade("½ºÆÀÆÑ");
		((Academy)ac).repare();
		
	}
		
}
