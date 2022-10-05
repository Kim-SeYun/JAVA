package ref_type;

public class ReferenceVarExample {
	public static void main(String[] args) {
		String Val1 = "ȫ�浿";
		String Val2 = "ȫ�浿";
		String Val3 = new String("ȫ�浿");
		String Val4 = new String("ȫ�浿");
		System.out.println(Val1 == Val2);
		System.out.println(Val2 != Val2);
		System.out.println(Val2 == Val3);
		System.out.println(Val2 != Val3);
		
	}

}
