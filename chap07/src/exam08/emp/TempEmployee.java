package exam08.emp;

public class TempEmployee extends Employee{
	 private int hireYear;
	 
	 public TempEmployee(int empno, String name, int pay, int hireYear) {
		 super(empno, name, pay);
		 this.hireYear = hireYear;
					
		}

	@Override
	public int getPayMonth() {
		return this.pay / 12;
	}
	 

}
