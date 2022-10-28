package exam19;

public class MemberController {
	
	@RequestMapping(command ="1")
	public void proceedFindAll() {
		System.out.println("모든회원찾기");
	}
	@RequestMapping(command ="2")
	public void proceedFindById() {
		System.out.println("번호로 조회");
	}
	@RequestMapping(command = "hello")
	public void hello(){
		System.out.println("hello");
	}
	@RequestMapping(command = "3")
	public void findByName(){
		System.out.println("이름으로 회원찾기");
	}
	

}
