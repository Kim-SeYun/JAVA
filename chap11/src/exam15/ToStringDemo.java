package exam15;

import java.util.Objects;

public class ToStringDemo {
	public static void main(String[] args) {
		String name = null;
		System.out.println(name);
//		System.out.println(name.toString()); // ���ܹ߻�
		System.out.println(Objects.toString(name));
		System.out.println(Objects.toString(name, "�⺻�� ����"));
	
	}

}
