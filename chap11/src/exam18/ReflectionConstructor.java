package exam18;

import java.lang.reflect.Constructor;
import java.util.Arrays;

import exam17.Member;

public class ReflectionConstructor {
	public static void main(String[] args) {
		Member member = new Member();
		Class<?> clazz = member.getClass();
		
		// ������ ����
		Constructor<?>[] constructors = clazz.getDeclaredConstructors();
		System.out.println(Arrays.toString(constructors));
		
		// �� �������� �Ķ���� ����
		System.out.println("ù��° ������ : " + constructors[0].getParameterCount());
		System.out.println("�ι�° ������ : " + constructors[1].getParameterCount());
		System.out.println("����° ������ : " + constructors[2].getParameterCount());
		
		// �� �������� �Ķ���� Ÿ��
		Class<?>[] parameterTypes = constructors[0].getParameterTypes();
		System.out.println(Arrays.toString(parameterTypes));
		Class<?>[] parameterTypes2 = constructors[1].getParameterTypes();
		System.out.println("�� ��° �������� �Ķ���� Ÿ�� : " + Arrays.toString(parameterTypes2));
		Class<?>[] parameterTypes3 = constructors[2].getParameterTypes();
		System.out.println("����° �������� �Ķ���� Ÿ�� : " + Arrays.toString(parameterTypes3));
	}

}
