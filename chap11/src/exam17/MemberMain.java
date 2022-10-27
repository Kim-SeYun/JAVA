package exam17;

public class MemberMain {
	public static void main(String[] args) throws ClassNotFoundException {
		// MemberŬ������ Class��ü ���� ���
		// ����ƽ �޼ҵ� ��� Class.forName()
		Class<?> clazz = Class.forName("exam17.Member");
		System.out.println("Ŭ���� �̸�: " + clazz.getName());
		System.out.println("��Ű���� ������ Ŭ���� �̸�: "+ clazz.getSimpleName());
		System.out.println("��Ű�� �̸� : " +clazz.getPackage().getName());
		System.out.println("��Ű�� �̸� : " +clazz.getPackageName());
		
		System.out.println("===============================");
		
		// �ν��Ͻ� �޼ҵ� ��� getClass()
		Member member = new Member();
		Class<?> clazz2 = member.getClass();
		System.out.println("Ŭ���� �̸�: " + clazz2.getName());
		System.out.println("��Ű���� ������ Ŭ���� �̸�: "+ clazz2.getSimpleName());
		System.out.println("��Ű�� �̸� : " +clazz2.getPackage().getName());
		System.out.println("��Ű�� �̸� : " +clazz2.getPackageName());
	}

}
