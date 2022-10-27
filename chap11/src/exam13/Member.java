package exam13;

import java.util.Objects;

public class Member {
	private String name;
	private Address address;
	
	public Member() {
	}

	public Member(String name, Address address) {
		this.name = name;
		this.address = Objects.requireNonNull(address, "Address에 Null값 할당함");
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
