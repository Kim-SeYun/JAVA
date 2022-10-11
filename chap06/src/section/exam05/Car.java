package section.exam05;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	
	public Car() {
		
	}
	
	public Car(String model) {
		this.model = model;
		
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
	
	public Car(String model, int maxSpeed, String color) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}

}
