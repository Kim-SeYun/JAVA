package exam08;

public class Demo3 {
	static int test = 15;
	
	static void methodBB() {
		System.out.println("����ƽ�޼ҵ�BB");
	}
	
	// ����ƽ ���
	public static void main(String[] args) {
		System.out.println(Calculator.field);
		Calculator.methodAA();
		
		Calculator cal = new Calculator();
		System.out.println(cal.field);
		cal.methodAA();
		System.out.println("=======================");
		System.out.println(Demo3.test);
		System.out.println(test);
		methodBB();
		Demo3.methodBB();
	}

}
