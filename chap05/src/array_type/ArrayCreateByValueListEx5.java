package array_type;

public class ArrayCreateByValueListEx5 {
	public static void main(String[] args) {
		
		// �迭�� ����� �ʱ�ȭ
		int[] scores ;
		scores = new int[] {100, 70, 50};
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		String[] names = {"ȫ�浿", "��浿"};
		names = new String[] {"�ڱ浿", "���浿"};
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
