package exam11;

public class Demo { // class앞에 final붙이면 상속 불가
	
	final int a;
	
	public Demo(int a) {
		this.a= a;
	}
	
	public final void methodAA() {
		System.out.println("오버라이딩 예정");
	}
	
	public static void main(String[] args) {
		final int test;
		test = 10; // 초기화
//		test = 15; // 재할당
		System.out.println(test);
		Demo demo = new Demo(10); // 생성자에서 초기화
//		demo.a=10; // (final필드에서)재할당 불가능
	}

}
