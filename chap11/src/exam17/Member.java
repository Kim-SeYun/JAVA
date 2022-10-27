package exam17;

public class Member {
	private int id;
	private String name;
	public Member() {
	}
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	protected Member(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void test(String name, int id, String nation) {
		
	}
	
}
