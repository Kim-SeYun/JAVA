package exam12.area02;

import exam12.area01.FactoryUnit;

public class Goliath extends FactoryUnit{
	
	public static final int MAX_HP = 300;
	public static final int MIN_HP = 150;
	
	int airMissilettack;
	
	public void info() {
		System.out.println("체력 : " + hp);
		System.out.println("공격력 : " + attack);
		System.out.println("방어력 : " + defence);
		
	}
	
	public void repareGoliath() {
		System.out.println("수리 대상 : 골리앗");
		repare();
	}
	public void setHp(int hp) {
		if(hp>MAX_HP) {
			this.hp = MAX_HP;
			return;
		}
		if(hp<MIN_HP) {
			this.hp = MIN_HP;
			return;
		}
		this.hp = hp;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}

}
