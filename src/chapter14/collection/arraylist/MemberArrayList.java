package chapter14.collection.arraylist;

import java.util.ArrayList;

import chapter14.collection.Member;

// ArrayList클래스의 데이터로 Member클래스 사용하기
public class MemberArrayList {
	
	// 기억장소를 인덱스로 관리하는 특징(순서 있고 데이터중복 허용)
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	// 데이터 추가 //위의 <>가 Member로 설정되어 있어서 아래의 파라미터도 Member로 사용함.
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// 데이터 제거
	public boolean removeMember(int memberId) {
//		arrayList.remove(memberId);
		
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i); //멤버를 삭제
				return true;
			}
		}
		return false;
	}
	
	// 모든 데이터 보기
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member); // member.toString() 호출
		}
		System.out.println();
	}
	

}
