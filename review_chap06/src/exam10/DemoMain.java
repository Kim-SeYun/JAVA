package exam10;

public class DemoMain {
	public static void main(String[] args) {
		// 회원가입
		// MemberService
		// 천명이 동시에 회원가입
		// 1명이 new MemberService()가 실행
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		SingleTon s3 = SingleTon.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
}
