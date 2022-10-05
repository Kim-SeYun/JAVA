package ref_type;

public class StringEqualsExample {
	
	public static void isRefEquals(String var1, String var2) {
		if(var1 ==var2) {
			System.out.println("두 변수는 참조값이 같음");
			return;
		}
		System.out.println("두 변수는 참조값이 다름");
	}

	public static void isValueEquals(String var1, String var2) {
		if(var1.equals(var2)) {
			System.out.println("두 변수가 값이 같음");
			return;
		}
		System.out.println("두 변수가 값이 다름");
	}
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		System.out.print("strVar1, strVar2 : ");
		isRefEquals(strVar1, strVar2);
		System.out.print("strVar1, strVar2 : ");
		isValueEquals(strVar1, strVar2);
		
		System.out.print("strVar3, strVar4 : ");
		isRefEquals(strVar3, strVar4);
		System.out.print("strVar3, strVar4 : ");
		isValueEquals(strVar3, strVar4);
		
		
	}
}
