package exam03;

public class AAA {
	// 가능 : 인스턴스 필드, 인스턴스 메소드, 상수
	// 불가능 : 정적필드, 스테틱 블록, 정적 메소드
	
	// 멤버 클래스
	class BBB{
		public int bb1; // 인스턴스 필드
//		static int bb2; // 정적필드(X)
		static final int bb3 = 10; // 상수
//		static {} // static 블록(X)
		
		public BBB() { // 생성자
			System.out.println("중첩클래스 BBB의 생성자");
		}
		
		public void methodBB() { // 인스턴스 메소드
			System.out.println("중첩클래스 메소드");
		}
		
//		public static void methodCC() {} // 정적메소드(X)
	}

}
