package exam03;

import java.sql.SQLException;

public class Point3D extends Point{
	
	String z;
	
	public Point3D(String x, String y, String z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String getLocation() {
		return "("+x+","+y+","+z+")";
	}

	@Override
	public int ��ǥ������() throws NumberFormatException{
		return super.��ǥ������() + Integer.parseInt(z);
	}
	
	


}
