package exam01;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accmulateRotation;
		if(accmulateRotation <= maxRotation) { // 최대회전수를 넘지 않은 경우
			System.out.print(location);
			System.out.print(" 한국타이어 수명 : ");
			System.out.println((maxRotation-accmulateRotation) + "회");
			return true;
			
		} // 최대회전수를 넘은 경우
		System.out.print(location);
		System.out.println(" 한국타이어 펑크");
		return false;
	}
	
	

}
	
	


