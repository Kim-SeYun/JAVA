package exam16;

public class HeroMain {
	public static void main(String[] args) {
		Arthas a1 = new Arthas();
		a1.move();
		a1.attack();
		a1.useUlt(); // 오버라이딩 메소드
		a1.infoArthas();
		System.out.println();
		
		// Hero클래스의 정의된 메소드만 접근가능함
		// a2는 Hero 탑입의 참조변수
		// a2는 Hero클래스에 정의된 메소드에만 접근가능하다.
		Hero a2 = new Arthas();
//		a2.infoArthas();
		a2.move();
		a2.attack();
		a2.useUlt(); // Arthas클래스의 메소드에 접근
		
	}

}
