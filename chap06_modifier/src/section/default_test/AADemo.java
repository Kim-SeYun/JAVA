package section.default_test;

import section.modifier.BB;

public class AADemo {
	public static void main(String[] args) {
		// AADemo클래스와 AAA클래스는 서로 다른 패키지 내에 존재
		// AAA클래스가 디폴트 접근제한자를 가지므로 AADemo클래스 내에서 AAA객체를 생성할 수 없음
		// AAA aaa = new AAA();
		
		BB bb = new BB();
	}

}
