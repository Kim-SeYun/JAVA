package exam07;

public abstract class Champion {
	int level = 1;
	int hp;
	int attack;
	static int testfiled;
	
	static {
		
	}
	
	
	public Champion(int hp, int attack) {
		this.hp = hp;
		this.attack = attack;
	}
	
	public void move(int x, int y) {
		System.out.printf("다음좌표로 이동 : (%d, %d)\n" , x, y);
	}
	
	public static void test() {
		
	}
	
	public abstract void useSkillQ();	
	public abstract void useSkillW();	
	public abstract void useSkillE();	
	public abstract void useSkillR();
	// public static void test02();
	
	

}
