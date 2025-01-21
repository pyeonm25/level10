package _12콜랙션멤버;

import java.util.ArrayList;

public class MemberDAO {

	private ArrayList<Member> memberList;
	
	private MemberDAO() {
		memberList = new ArrayList<Member>();
	}
	private static MemberDAO instance;
	public static MemberDAO getInstance() {
		if(instance == null) instance = new MemberDAO();
		return instance;
	}
	
	public boolean isDataExsit() {
		return memberList.size() != 0;
	}
	
	private int getMemberIdxById(String id) {
		
		if(!isDataExsit()) return -1;
		int idx=0;
		for(Member m : memberList) {
			if( m.getId().equals(id)) return idx;
			idx+=1;
		}
		return -1;
	}
	
	public boolean isValidId(String id) {
		return getMemberIdxById(id)==-1;
	}
	
	public void addAMember(String id, String pw, String name) {
		insertAMember(new Member(id, pw, name));
		
		
	}
	private void insertAMember(Member member) {
		memberList.add(member);
	}

	
	public void printAllMember() {
		for(Member m : memberList)
			System.out.println(m);
	}
}
