package exam01;

public class Cellphone {
	String model;
	String color;
	
	protected Cellphone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("����on");
		
	}
	
	void powerOff() {
		System.out.println("����off");
	}
	public void bell() {
		System.out.println("ring");
	}

}
