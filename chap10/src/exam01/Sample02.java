package exam01;

public class Sample02 {
	public static void main(String[] args) {
		String data = null;
		try {
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			System.out.println("�Էµ� �����Ͱ� �����ϴ�.");
		}
	}

}