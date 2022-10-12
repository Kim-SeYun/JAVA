package exam09;

import java.util.ArrayList;

public class Barracks extends GenBuilding{

	public Barracks(int hp, int buildTime) {
		super(hp, buildTime);
	}

	@Override
	public void setunitList() {
		this.unitList = new ArrayList<String>();
		this.unitList.add("마린");
		this.unitList.add("파이버뱃");
		this.unitList.add("고스트");
	}
	
	
	

}
