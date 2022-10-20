package exam;

import java.util.Arrays;

public class Game369 {
	public static void main(String[] args) {
		int order = 29423;
		String str = order+"";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        
        int result = 0;
        for(int i=0; i<str.length(); i++) {
        	if(arr[i].equals("3") | arr[i].equals("6") | arr[i].equals("9")) {
        		result++;
        	}
        }
        System.out.println(result);
	}

}
