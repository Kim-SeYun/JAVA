package exam;

public class DiceCount {
	public static void main(String[] args) {
		int[] box = {10,8,6};
		int n = 3;
		int result = 0;
	
		
		result = (box[0]/n) * (box[1]/n) * (box[2]/n);
		
		System.out.println(result);
	}

}
