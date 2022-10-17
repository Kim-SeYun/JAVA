package exam05;

public class PhoneMain2 {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		Phone p2 = new SmartPhone();
		SmartPhone p3 = new SmartPhone();
		checkType(p1); // false
		checkType(p2); // true
		checkType(p3); // true
	}
	
	public static void checkType(Phone obj) {
		if(obj instanceof SmartPhone) {
			System.out.println("SmartPhone 타입");
		}else {
			System.out.println("SmartPhone 타입 아님");
		}
	}
}

