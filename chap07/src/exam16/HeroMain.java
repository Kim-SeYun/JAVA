package exam16;

public class HeroMain {
	public static void main(String[] args) {
		Arthas a1 = new Arthas();
		a1.move();
		a1.attack();
		a1.useUlt(); // �������̵� �޼ҵ�
		a1.infoArthas();
		System.out.println();
		
		// HeroŬ������ ���ǵ� �޼ҵ常 ���ٰ�����
		// a2�� Hero ž���� ��������
		// a2�� HeroŬ������ ���ǵ� �޼ҵ忡�� ���ٰ����ϴ�.
		Hero a2 = new Arthas();
//		a2.infoArthas();
		a2.move();
		a2.attack();
		a2.useUlt(); // ArthasŬ������ �޼ҵ忡 ����
		
	}

}
