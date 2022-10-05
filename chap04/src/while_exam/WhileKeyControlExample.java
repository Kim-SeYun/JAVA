package while_exam;

import java.io.IOException;

public class WhileKeyControlExample {
	public static void main(String[] args) throws IOException {
		
		boolean run = true;
		int speed = 0;
		int KeyCode = 0;
		
		while(run) {
			if(KeyCode != 13 && KeyCode !=10) {
				System.out.println("==============");
				System.out.println("1.종속 | 2.감속 | 3.중지 ");
				System.out.println("===============");
				System.out.print("선택 : ");
				
			}
			
			KeyCode = System.in.read();
			
			if(KeyCode==49) {
				speed++;
				System.out.println("현재속도 : " + speed);
			}else if(KeyCode == 50) {
				speed--;
				System.out.println("현재속도 : " + speed);
			}else if(KeyCode == 51) {
				run = false;
			}
		}
		System.out.println("프로그램을 종료합니다.");
		
	}

}
