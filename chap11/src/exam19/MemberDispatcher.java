package exam19;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MemberDispatcher {
	// 역할 : 사용자로부터 요청을 받아 전달받은 요청을 컨트롤러에 전달
	
	MemberController controller = new MemberController();
	

	public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Scanner scan = new Scanner(System.in);
		System.out.println("프로그램 실행");
		while(true) {
			System.out.print(">>메뉴선택");
			String command = scan.nextLine();
			
			if(command.equals("0")) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			
			// MemberController에 선언된 메소드 정보를 Method[]타입으로 받아옴
			Method[] methods = controller.getClass().getDeclaredMethods();
			
			Method findMethod = null;
			for(Method method : methods) {
				// 메소드에 선언된 RequestMapping타입의 어노테이션
				RequestMapping requestMapping = method.getDeclaredAnnotation(RequestMapping.class);
				if(requestMapping != null) {
					String value = requestMapping.command();
					if(command.equals(value)) {
						findMethod = method;
						break;
					}
				}
				
				}
			if(findMethod != null) {
				findMethod.invoke(controller);
			}else {
				System.out.println("올바른 값을 입력하세요");
			}
		} // while end
		
	} // run end

}
