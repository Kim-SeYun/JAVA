package exam18;

import java.lang.reflect.Constructor;
import java.util.Arrays;

import exam17.Member;

public class ReflectionConstructor {
	public static void main(String[] args) {
		Member member = new Member();
		Class<?> clazz = member.getClass();
		
		// 생성자 정보
		Constructor<?>[] constructors = clazz.getDeclaredConstructors();
		System.out.println(Arrays.toString(constructors));
		
		// 각 생성자의 파라미터 개수
		System.out.println("첫번째 생성자 : " + constructors[0].getParameterCount());
		System.out.println("두번째 생성자 : " + constructors[1].getParameterCount());
		System.out.println("세번째 생성자 : " + constructors[2].getParameterCount());
		
		// 각 생성자의 파라미터 타입
		Class<?>[] parameterTypes = constructors[0].getParameterTypes();
		System.out.println(Arrays.toString(parameterTypes));
		Class<?>[] parameterTypes2 = constructors[1].getParameterTypes();
		System.out.println("두 번째 생성자의 파라미터 타입 : " + Arrays.toString(parameterTypes2));
		Class<?>[] parameterTypes3 = constructors[2].getParameterTypes();
		System.out.println("세번째 생성자의 파라미터 타입 : " + Arrays.toString(parameterTypes3));
	}

}
