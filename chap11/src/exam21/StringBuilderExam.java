package exam21;

public class StringBuilderExam {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Java");
		sb.append("Oracle");
		sb.append("JSP");
		System.out.println(sb.toString());
		
		sb.insert(4, "11"); // endIndex(미포함)
		System.out.println(sb);
		
		sb.replace(2, 5, "Spring");
		System.out.println(sb);
		
		sb.delete(2, 3); // endIndex(미포함)
		System.out.println(sb);
		
		System.out.println(sb.length());
		System.out.println(sb.reverse());
	}

}
