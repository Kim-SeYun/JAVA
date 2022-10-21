package exam05;

public class Animal {
	// Animal(����Ŭ����, ū Ÿ��)
	// Dog, Cat(����Ŭ����, ���� Ÿ��)
	
	void run() {
		System.out.println("run");
	}
	
	void cry() {
		
	}
	
	public static void main(String[] args) {
		// ����Ÿ���� ��ü�� ū Ÿ�Կ� �Ҵ� : �ڵ�Ÿ�Ժ�ȯ(Promotion), ������
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		// ����Ŭ������ �Ҵ�Ǿ��� ��� ����Ŭ������ ���ǵ� �޼ҵ常 ����� �� �ִ�.
		a1.run();
		a2.run();
		a1.cry();
		a2.cry();
		// ����Ŭ�������� ���ǵ� �޼ҵ带 ����Ϸ��� ����Ŭ���� Ÿ������ Ÿ�Ժ�ȯ�� �ؾ��Ѵ�.
		((Dog)a1).methodA();
		((Cat)a2).methodB();
		
		
		// ū Ÿ���� ��ü�� ���� Ÿ�Կ� �Ҵ� : ����Ÿ�Ժ�ȯ(Casting), �����
		Dog b1 = (Dog)new Animal();
		Cat b2 = (Cat)new Animal();
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println("�۸�");
	}
	void methodA() {
		System.out.println("methodA����");
	}
}
class Cat extends Animal{
	void cry() {
		System.out.println("�߿�");
	}
	void methodB() {
		System.out.println("methodB����");
	}
}