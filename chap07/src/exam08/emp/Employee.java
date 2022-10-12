package exam08.emp;

public class Employee {
	
	protected int empno;
	protected String name;
	protected int pay;
	
	public Employee() {

	}
	
	public Employee(int empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	// 월급여(메소드)
	public int getPayMonth() {
		return 200;
	}
	
	

}
