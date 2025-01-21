package _12콜랙션멤버;

// mvc : model view controller 

// controller 기능 - 페이지 연결 
// 페이지 (view :Action 객체들) : 사용자 값 받아오고 값 전달 
// DAO : 여러개의 맴버들의 기능 
// VO(model) : Member

public class ActionInsert implements Action {

	@Override
	public void excute() {

		MemberDAO dao = MemberDAO.getInstance();
		Utils utils = Utils.getInstance();
		System.out.println("==== [ 회원가입 ] ==== ");
		
		// 추가하는 dao 연결 
		String id = utils.getStrValue("ID>> ");
		String pw =utils.getStrValue("PW>> ");
		String name =utils.getStrValue("NAME>> ");
		
		if(!dao.isValidId(id)) {
			System.out.println("이미 사용하는 아이디입니다");
			return;
		}
		
		dao.addAMember(id , pw , name);
		dao.printAllMember();
		System.out.println("회원 가입 완료");
	}

}
