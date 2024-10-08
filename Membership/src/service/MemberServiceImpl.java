package service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dao.MemberDao;
import dao.MemberDaoImpl;
import dto.Member;

/* 왜 Service, Dao 인터페이스를 만들어서 구현했을까?
 * - 인터페이스를 상속 받아 구현하면
 *   모든 자식 클래스가 똑같은 기능을 가지게되어
 *   비슷하게 생김!
 * 
 *  -> 언제든지 서로 다른 자식 클래스로 대체 가능!!
 *    ==> 유지보수성 증가
 */

// MemberService를 상속 받아 구현
public class MemberServiceImpl implements MemberService{

	// dao 객체 부모 참조 변수 선언 
	private MemberDao dao = null;
	
	// 기본 생성자
	// - MemberServiceImpl 객체 생성 시
	//   MemberDaoImpl 객체도 생성
	public MemberServiceImpl() throws FileNotFoundException, 
									  ClassNotFoundException,
									  IOException {
		dao = new MemberDaoImpl();
	}
	
	
	// 회원 추가
	@Override
	public boolean addMember(String name, String phone) throws IOException {
		
		// 1) 회원 목록을 얻어와 휴대폰 번호 중복 검사
		List<Member> memberList = dao.getMemberList();  
		
		for(Member member : memberList) {
			// 휴대폰 번호가 같은 경우 == 중복인 경우
			if( phone.equals(member.getPhone()) ) {
				return false;
			}
		}
		
		// 2) 중복이 아닌 경우
		//    입력 받은 정보를 이용해 Member 객체를 생성하고
		//    DAO에 전달하여 파일에 저장
		Member member = new Member(name, phone, 0, Member.COMMON);
		
		// DAO 메서드 호출 후 결과 반환 받기
		boolean result = dao.addMember(member);
		return result;
	}
	
	
	// DAO에서 조회한 memberList를 그대로 반환
	// (해당 서비스 메서드는 따로 처리할 조건/기능이 없어서
	//  중간에서 전달만 해주는 역할이됨)
	@Override
	public List<Member> getMemberList() {
		return dao.getMemberList();
	}
	
	
	// 이름 검색
	@Override
	public List<Member> selectName(String searchName) {
		
		// DAO를 이용해서 회원 전체 목록 조회
		List<Member> memberList = dao.getMemberList();
		
		// memberList에 저장된 요소(회원) 중 
		// 이름이 같은 회원을 찾아서 
		// 검색 결과를 저장할 별도 List에 추가
		List<Member> searchList = new ArrayList<Member>();
		
		for(Member member : memberList) {
			
			if(member.getName().equals(searchName)) {
				searchList.add(member);
			}
		}
		
		
		return searchList; // 검색 결과 반환
	}
	
	
	
	
	
	
	
}
