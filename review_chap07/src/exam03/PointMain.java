package exam03;

public class PointMain {
	public static void main(String[] args) {
		Point p1 = new Point("10", "2");
		System.out.println(p1.getLocation());
		System.out.println(p1.��ǥ������());
		
		Point p2 = new Point3D("1", "4", "a10");
		System.out.println(p2.getLocation());
		try {
			System.out.println(p2.��ǥ������());
		} catch (Exception e) {
			System.out.println("����ó��");
		}
		
		
	}

}
