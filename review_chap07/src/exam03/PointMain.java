package exam03;

public class PointMain {
	public static void main(String[] args) {
		Point p1 = new Point("10", "2");
		System.out.println(p1.getLocation());
		System.out.println(p1.좌표값의합());
		
		Point p2 = new Point3D("1", "4", "a10");
		System.out.println(p2.getLocation());
		try {
			System.out.println(p2.좌표값의합());
		} catch (Exception e) {
			System.out.println("예외처리");
		}
		
		
	}

}
