package exam10;

public class Member implements Comparable<Member>{
	private int id;
	private String name;
	
	public Member(int id, String name) {
		this.id = id;
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
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Member member) {
//		return this.name.compareTo(member.getName()); // 사전순서
//		return member.getName().compareTo(this.name); // 사전역순
		
		return this.name.compareTo(member.getName());
	}

	
	
	

}


