package section02.exam06;

public class Television2 {
	
	static String company;
	static String model;
	static String info;
	String color;
	
	static { // 정적블록
		company = "삼성";
		model = "LCD";
		info = company + "_" + model;
//		color = "red"; // 정적 블록에서는 인스턴스 변수(필드)를 사용할 수 없다.
	}
	
	
	public static void main(String[] args) {
		System.out.println(Television2.company);
		System.out.println(model);
		System.out.println(info);
		
	}

}
