package section.exam04;

public class KoreanExam {
	public static void main(String[] args) {
		Korean k1 = new Korean("��ö��", "920510-1684015");
		Korean k2 = new Korean("�迵��", "930618-2674017");
		System.out.println(k1);
		System.out.println(k2);
		k1.print();
		k2.print();
		
		Korean k3 = new Korean("ȫ�浿", "000000-0101010");
		k3.print();
		
		System.out.println(Korean.id);
		System.out.println(k1.id);
		System.out.println(k2.id);
		
	}

}
