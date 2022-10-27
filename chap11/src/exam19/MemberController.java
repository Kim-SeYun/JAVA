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

}
