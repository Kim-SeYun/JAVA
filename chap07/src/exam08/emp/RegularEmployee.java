package exam08.emp;

public class RegularEmployee extends Employee{
	
	private int bonus;
	
	public RegularEmployee(int empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
				
	}
	@Override
	public int getPayMonth() {
		return (this.pay + this.bonus) / 12;
	}
	
	

}
