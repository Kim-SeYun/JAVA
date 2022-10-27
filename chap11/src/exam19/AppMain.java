package exam19;

import java.lang.reflect.InvocationTargetException;

public class AppMain {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		MemberDispatcher dispatcher = new MemberDispatcher();
		dispatcher.run();
	}

}
