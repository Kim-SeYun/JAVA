package exam;

import java.util.Arrays;

public class RockScissorsPaper {
	public static void main(String[] args) {
		String rsp = "205";
		String answer = "";
		String[] result = rsp.split("");
		System.out.println(Arrays.toString(result));
		for(int i=0; i<result.length; i++) {
			if(result[i].equals("2")) {
				answer += "0";
			}else if(result[i].equals("0")) {
				answer += "5";
			}else answer += "2";
		}
		System.out.println(answer);
		
	}

}
