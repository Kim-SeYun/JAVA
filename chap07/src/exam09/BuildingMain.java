package exam09;

public class BuildingMain {
	public static void main(String[] args) {
		Barracks b = new Barracks(2000, 10);
		b.setunitList();
		Factory f = new Factory(2500, 15);
		f.setunitList();
		System.out.println("병영 생산 가능한 유닛 : "  + b.getunitList());
		System.out.println("군수공장 생산 가능한 유닛 : "  + f.getunitList());
		
	}

}





/*
 유닛생산건물(GenBuilding)
 내구성(hp)
 건설시간(buildTime)
 생산 유닛 목록(unitList)
 
 병영(barrecks)
 생산가능 유닛 : marine(마린), firebat(파이어밧), ghost(고스트)
 
 군수공장(factory)
 생산가능 유닛 : vulture(벌처), tank(탱크), goliath(골리앗)
 
 
 
 */