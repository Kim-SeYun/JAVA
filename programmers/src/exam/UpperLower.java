package exam;

public class UpperLower {
	public static void main(String[] args) {
	
		String my_string = "cccCCC";
		String result = "";
		
		for(char c : my_string.toCharArray()) {
			
			if(c>64 && c<91) {
				char tmp = (char)(c+32);
				result += tmp;
			}else {
				char tmp = (char)(c-32);
				result += tmp;
			}
		}
		
		System.out.println(result);
		
		
	}

}
