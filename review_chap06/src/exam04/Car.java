package exam04;

public class Car{
	
	String name;
	String company;
	
	// 다른생성자(매개변수가 있는 생성자)가 없으면 컴파일시 컴파일러가 기본생성자를 추가한다.
	
	public Car() {
		super(); // 부모생성자 호출
		// 여기서 Car클래스의 부모 : Object
	}
	
	public Car(String name) {
		this.name = name;
	}
	
	public Car(String name, String company) {
		this.name = name;
		this.company = company;
	}

	public static void main(String[] args) {
		Car car = new Car(); // 기본생성자 호출
		
	}

}
