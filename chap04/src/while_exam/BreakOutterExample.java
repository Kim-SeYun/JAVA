package while_exam;

public class BreakOutterExample {
	public static void main(String[] args) {
		for(char upper='A'; upper <= 'Z'; upper++) {
			for(char lower='a'; lower <= 'z'; lower++) {
				System.out.println(upper+"_"+lower);
				if(lower == 'g') break;
			}
		}
	}

}
