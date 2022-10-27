package exam18;

import java.lang.reflect.Field;
import java.util.Arrays;

import exam17.Member;

public class ReflectionField {
	public static void main(String[] args) {
		Member member = new Member();
		Class<?> clazz = member.getClass();
		Field[] fields = clazz.getDeclaredFields();
		System.out.println(Arrays.toString(fields));
		
		// �ʵ� �̸�
		for(Field f : fields) {
			String name = f.getName();
			System.out.println(name);
		}
		// �ʵ� Ÿ��
		for(Field f : fields) {
			String type = f.getType().getName();
			System.out.println(type);
		}
		
	}

}
