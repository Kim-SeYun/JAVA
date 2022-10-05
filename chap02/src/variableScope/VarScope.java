package variableScope;

public class VarScope { //클래스 블록 시작
	
	public static void main(String[] args) { // 메인메소드 블록 시작
		String result = "메인메소드블록";
		if(10>5) { //if블록 시작			
			
			System.out.println(result);
			
		} //if블록 끝
		
	} //메인메소드 블록 끝

} //클래스 블록 끝
