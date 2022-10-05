package while_exam;

import java.util.Scanner;

public class WhileSumExample3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		
		while(run) {
			System.out.println("Hello");
			System.out.print("명령어를 입력하세요 >>");
			String exit = scanner.nextLine();
			if(exit.equals("exit")) {
				run = false;
				System.out.println("종료");
			}
			
		}
			
		
	}

}
