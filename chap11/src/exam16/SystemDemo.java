package exam16;

public class SystemDemo {
	public static void main(String[] args) {
		// UTC ���� 1970�� 1�� 1�� 0��0��0��0�и��� ~ ��������� �и��ʷ� ��Ÿ��
		long curTime = System.currentTimeMillis();
		System.out.println(curTime);
		curTime /= 1000;
		System.out.println(curTime + "��");
		curTime /= 60;
		System.out.println(curTime + "��");
		curTime /= 60;
		System.out.println(curTime + "�ð�");
		curTime /= 24;
		System.out.println(curTime + "��");
		curTime /= 365;
		System.out.println(curTime + "��");
		
	}

}
