package exam14;

public class HeroMain {
	public static void main(String[] args) {
		Item i = new Item("방천화극", "공격력");
		Hero h = new Hero("여포", 10, i);
		h.printInfo();
		
		// Phone -> SmartPhone; (isA관계 -> is kind of)
		// 스마트폰은 폰이다.
		// 폰은 스마트 폰이다.(역은 생성 불가)
		// 인간은 포유류이다. (O)
		// 포유류는 인간이다. (X)
	}

}
