package exam18;

import java.lang.reflect.Method;
import java.util.Arrays;

import exam17.Member;

public class ReflectionMethod {
	public static void main(String[] args) {
		Member member = new Member();
		Class<?> clazz = member.getClass();
		
		Method[] methods = clazz.getDeclaredMethods();
		System.out.println(Arrays.toString(methods));
		
		System.out.println("=========================");
		
		for(Method m : methods) {
			System.out.println("=========================");
			System.out.println("메소드 이름 : " + m.getName());
			System.out.println("파라미터 개수 : " + m.getParameterCount());
			
			Class<?>[] parameterTypes = m.getParameterTypes();
			for(Class<?> type : parameterTypes) {
				System.out.println("파라미터 타입 : " + type.getName());
			}
		}
	}

}
