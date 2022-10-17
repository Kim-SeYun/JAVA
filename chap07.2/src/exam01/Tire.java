package exam01;

public class Tire {
	int maxRotation; // 최대 회전수
	int accmulateRotation; // 누적 회전수
	String location; // 타이어 위치
	
	public Tire(String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() {
		++accmulateRotation;
		if(accmulateRotation <= maxRotation) { // 최대회전수를 넘지 않은 경우
			System.out.print(location);
			System.out.print(" Tire 수명 : ");
			System.out.println((maxRotation-accmulateRotation) + "회");
			return true;
			
		} // 최대회전수를 넘은 경우
		System.out.print(location);
		System.out.println(" Tire 펑크");
		return false;
	}

}