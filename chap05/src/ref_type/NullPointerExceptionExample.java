package ref_type;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String Val1 = "È«±æµ¿";
		String Val2 = "È«±æµ¿";
		if(Val1 != null) {
			System.out.println(Val1.equals(Val2));
			
		}
		String str = null;
		int size = str.length(); 
		System.out.println(size);
		System.out.println("¸ÞÀÎ Á¾·á");
	}

}
