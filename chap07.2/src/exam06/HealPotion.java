package exam06;

public class HealPotion extends Potion{
	int recovery = 70;
	
	@Override
	public void recovery(Hero hero) {
		int hp = hero.getHp();
		int maxHp = hero.getMaxHp();
		if(hp == maxHp) { 
			System.out.println("�� �̻� ȸ���� �� �����ϴ�.");
			return;
		}
		hp += this.recovery;
		if(hp >= maxHp) { // �ʰ�ȸ��
			System.out.println("��� ������� ȸ���Ǿ����ϴ�.");
			hero.setHp(maxHp);
			return;
		}
		
		hero.setHp(hp);
	}
}
