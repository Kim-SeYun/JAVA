package exam09;

public class MemberDaoByMYSQL implements MemberDao{

	@Override
	public void selectAll() {
		System.out.println("MYSQL 데이터베이스 조회");
	}
	

}
