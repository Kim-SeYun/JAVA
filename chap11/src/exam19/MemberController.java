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
	@RequestMapping(command = "hello")
	public void hello(){
		System.out.println("hello");
	}
	@RequestMapping(command = "3")
	public void findByName(){
		System.out.println("�̸����� ȸ��ã��");
	}
	

}
