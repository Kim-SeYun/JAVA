package arrayinArray;

import java.util.Arrays;

public class ArrayIndexEx2 {
	public static void main(String[] args) {
		
		String[][] players = {
				{"±èÁø¼ö","±è¿µ±Ç","±è¹ÎÀç","È«Ã¶"}, // 0
				{"ÀÌÀç¼º","È²ÀÎ¹ü","±ÇÃ¢ÈÆ"}, // 1
				{"ÀÌµ¿°æ","¼ÕÈï¹Î"}, // 2
				{"È²ÀÇÁ¶"} // 3
					
				
		};
		System.out.println(players.length);
		System.out.println(players[0].length);
		System.out.println(players[1].length);
		String[] wing = players[2];
		System.out.println(Arrays.toString(wing));
		System.out.println(players[1][2]);
		
		for (int i = 0; i < players.length; i++) {
			for (int j = 0; j < players[i].length; j++) {
				System.out.println(players[i][j]);
				
			}
			
		}
	}
	


}
