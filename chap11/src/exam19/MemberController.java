package exam19;

public class MemberController {
	
	@RequestMapping(command ="1")
	public void proceedFindAll() {
		System.out.println("���ȸ��ã��");
	}
	@RequestMapping(command ="2")
	public void proceedFindById() {
		System.out.println("��ȣ�� ��ȸ");
	}

}
