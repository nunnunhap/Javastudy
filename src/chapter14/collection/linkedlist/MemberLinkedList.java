package chapter14.collection.linkedlist;

import java.util.LinkedList;

import chapter14.collection.Member;

// LinkedList클래스의 데이터로 Member클래스 사용하기
public class MemberLinkedList {
	
	// 기억장소를 인덱스로 관리하는 특징(순서 있고 데이터중복 허용)
	private LinkedList<Member> linkedList;
	
	public MemberLinkedList() {
		linkedList = new LinkedList<Member>();
	}
	
	// 데이터 추가 //위의 <>가 Member로 설정되어 있어서 아래의 파라미터도 Member로 사용함.
	public void addMember(Member member) {
		linkedList.add(member);
	}
	
	// 데이터 제거
	public boolean removeMember(int memberId) {
//		linkedList.remove(memberId);
		
		for(int i=0; i<linkedList.size(); i++) {
			Member member = linkedList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				linkedList.remove(i); //멤버를 삭제
				return true;
			}
		}
		return false;
	}
	
	// 모든 데이터 보기
	public void showAllMember() {
		for(Member member : linkedList) {
			System.out.println(member); // member.toString() 호출
		}
		System.out.println();
	}
	

}
