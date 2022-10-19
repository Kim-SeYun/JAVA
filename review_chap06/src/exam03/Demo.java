package exam03;

public class Demo {
	
	int ivalue;
	double dvalue;
	boolean bool;
	String str;
	
	public static void main(String[] args) {
		// 초기화 되지 않은 로컬변수
//		int v1;
//		double v2;
//		boolean v3;
//		System.out.println(v1);
		Demo d = new Demo();
		System.out.println(d.ivalue); // 0
		System.out.println(d.bool); // false
		System.out.println(d.str); // null
	}

}
