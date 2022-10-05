package arrayinArray;

import java.util.Arrays;

public class ArrayIndexEx {
	public static void main(String[] args) {
		
		int[][] arrayInArray = new int[3][6];
		
		// 青纺 备炼客 悼老 3x6
		arrayInArray = new int[][]{
				{00, 01, 02, 03, 04, 05},
				{10, 11, 12, 13, 14, 15},
				{30, 31, 32, 33, 34, 35},
		};
		System.out.println(arrayInArray[1][3]);
		System.out.println(arrayInArray[2][3]);
		System.out.println(arrayInArray[0].length);
		System.out.println(arrayInArray[1].length);
		System.out.println(arrayInArray[2].length);
		
		System.out.println(Arrays.deepToString(arrayInArray));
		
		System.out.println(Arrays.toString(arrayInArray));
		System.out.println(Arrays.deepToString(arrayInArray));
		System.out.println("==================备盒急===============");
		
		for (int i = 0; i < arrayInArray.length; i++) {
			for (int j = 0; j < arrayInArray[i].length; j++) {
				
			
			System.out.println(arrayInArray[i][j]);
			
		}
	}
	

	}
}
