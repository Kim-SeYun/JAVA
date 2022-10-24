package exam03;

import exam03.AAA.BBB;

public class AAADemo {
	public static void main(String[] args) {
		AAA a = new AAA();
		BBB b = a.new BBB();
		System.out.println(b.bb1);
		b.methodBB();
		System.out.println(BBB.bb3);
	}

}
