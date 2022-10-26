package exam;

public class Ant {
	public static void main(String[] args) {
		int hp = 999;
		int result = 0;
		int a = 5;
		int b = 3;
		int c = 1;
		if(hp%a != 0) {						
			if((hp%a)%b ==0) {
				result = hp/a + (hp%a)/b;
			}else if(((hp%a)%b)%c==0) {
				result = hp/a + (hp%a)/b + ((hp%a)%b)/c;
			}	
		
		}else result = hp/a;
		System.out.println(result);
		}
		
	}


	

