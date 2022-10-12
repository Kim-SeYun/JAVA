package exam09;

import java.util.ArrayList;
import java.util.List;

public abstract class GenBuilding {
	
	int hp;
	int buildTime;
	List<String> unitList;
	
	public GenBuilding(int hp, int buildTime) {
		this.hp = hp;
		this.buildTime = buildTime;
	}
	
	public List<String> getunitList(){
		return this.unitList;
	}
	
	abstract public void setunitList();
	

}
