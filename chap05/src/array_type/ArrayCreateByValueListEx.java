package array_type;

public class ArrayCreateByValueListEx {
	public static void main(String[] args) {
		
		// �迭�� ����� �ʱ�ȭ
		int[] scores = {83, 90, 87 ,70, 75};
		// �迭�� ���� : ����� ����(5��)
		System.out.println(scores.length); // 6
		
		
		// �ݺ������� �迭 ��ҿ� ����
		for(int i =0; i<=4; i++) {
			System.out.println(scores[i]);
		}
		
		String[] names = {"ȫ�浿", "��浿", "�ڱ浿"};
		for(int i =0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		boolean[] flags = {false, true, false, false, true};
		for(int i=0; i<flags.length; i++) {
			System.out.println(flags[i]);
		}
		
	}

}
