package exam13;

public class AnimalExample {
	public static void main(String[] args) {
		// long타입 > int타입
		long longValue = 10;
		int intValue = 10;
		
		// int타입을 long 할당(자동형변환, 묵시적형변환)
		long longTemp = intValue;
		// long타입을 int에 할당(강제형변환, 명시적형변황)
		int intTemp = (int)longValue;
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		// Cat, Dog를 Animal 타입에 할당 (자동형변환)
		Animal a1 = dog;
		Animal a2 = cat;
		Animal a3 = new Dog();
		Animal a4 = new Cat();
		
		// Animal타입을 각각 Cat, Dog타입에 할당
		Cat cat2 = (Cat) new Animal();
		Dog dog2 = (Dog) new Animal();
	}
}

class Animal{
	// 슈퍼 클래스 : Animal (크기가 큰 타입)
	// 서브 클래스 : Dog, Cat (크기가 작은 타입)
	
}

class Dog extends Animal{
	
}

class Cat extends Animal{
	
}
