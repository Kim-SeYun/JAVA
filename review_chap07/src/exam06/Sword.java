package exam06;

public class Sword extends Item{
	private String name;

	public Sword(String name) {
		this.name = name;
	}

	@Override
	public String getItem() {
		return name;
	}


}
