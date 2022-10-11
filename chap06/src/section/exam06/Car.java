package section.exam06;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	
	public Car() {
		this("그랜저");
		System.out.println("기본생성자 실행");
		
	}

	public Car(String model) {
		// this()는 다른생성자
		this(model, "은색", 250);
		
	}
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
		
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	void print() {
		System.out.println("제조사 : " + company);
		System.out.println("모뎅 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("최고 속도 : " + maxSpeed);
		System.out.println();
	}

}
