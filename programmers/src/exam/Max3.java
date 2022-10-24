package exam;

import java.util.Arrays;

public class Max3 {
	public static void main(String[] args) {
		int[] array = {1, 8, 3};
		int[] answer = new int[2];
		int max = 0;
		int index = 0;
        for(int i=0; i<array.length; i++){
        	if(array[i]>max) {
        		max = array[i];
        		index =i;
        	}
//            for(int j=1; j<array.length; j++){
//                if(array[i] > array[j]) {
//                	answer = array[i];
//                
//                }
        	answer[0]=max;
        	answer[1]=index;
            
        }
        System.out.println(Arrays.toString(answer));
	}
	
}
