package section02.exam09;

public final class PersonExam {
	public static void main(String[] args) {
		// final�� ������ �� : �ʵ�(���Ҵ�Ұ���), Ŭ����(��ӺҰ���)
		
		Person person = new Person();
		person.name = "ȫ�浿";
		
		// final �ʵ� ���Ҵ� �Ұ���
//		person.nation = "�̱�";
//		person.ssn = "���þ�";
		
		Person person2 = new Person("���þ�", "0000");
		person2.name = "Ǫƾ";
//		person2.nation = "����";
//		person2.ssn = "1212121";
	}

}
