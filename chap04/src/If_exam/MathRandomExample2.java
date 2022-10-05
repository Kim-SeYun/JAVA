package If_exam;

public class MathRandomExample2 {
	public static void main(String[] args) {
		// 0 < random < 1 
		// 0 < random * 6 + 1 < 7
		int dice = (int)(Math.random() * 6) + 1;
		int lotto = (int)(Math.random()* 45) + 1;
		System.out.println(dice); // 1~6점수
		System.out.println(lotto); // 1~45점수
		
	}

}
