package while_exam;

public class WhileSumExample2 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while((sum += ++i) <= 100) {
			System.out.println(i + " - " +"누적합계 : " + sum);
			
		}
	}

}
