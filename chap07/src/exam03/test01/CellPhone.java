package exam03.test01;

public class CellPhone {
	// public
	// protected : 동일패키지, 상속한 클래스
	
	protected boolean power; // false
	protected String model;
	protected String company;
	protected String phoneNumber;
	
	public CellPhone() {}
	
	public CellPhone(String model, String company, String phoneNumber) {
		this.model = model;
		this.company = company;
		this.phoneNumber = phoneNumber;
	}
	
	public void makeAPhoneCall(String dial) {
		if(!isPowerOn(this.power)) return;
		System.out.println(dial+" 번호로 전화를 겁니다.");
	}
	
	protected boolean isPowerOn(boolean power) {	
		if(power == false) {
			System.out.println("전원이 꺼진 상태입니다.");
		}
		return power;
	}

	// 게터 getPower(X) boolean 타입이면 접두사 is
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	

}