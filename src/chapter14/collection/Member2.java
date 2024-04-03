package chapter14.collection;

public class Member2 implements Comparable<Member2> {
	private int memberId;
	private String memberName;
	
	
	// 매개변수 있는 생성자
	public Member2(int memberId, String memberName) {
		super(); // Object클래스의 생성자 호출. 컴파일과정에서 자동 생성.
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	// getter, setter 메서드
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override // 클래스의 필드(member)에 대한 정보 확인.
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
	// 객체 비교로 사용되는 메서드 재정의
	@Override
	public int hashCode() {
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2) obj;
			if(this.memberId == member.memberId && this.memberName.equals(member.memberName))
				return true;
			else
				return false;
		}
		return super.equals(obj);
	}

	// 객체가 대소비교에 사용되는 추상메서드 구현용도
//	@Override
//	public int compare(Member2 o1, Member2 o2) {
//		// Member2 클래스를 대소비교할 때 기준을 잡아야 한다.
//		// memberID를 대소비교 대상으로 기준을 잡음.
//		System.out.println("compare호출 확인용도");
//		return o1.getMemberId() - o2.getMemberId();
//	}

	@Override
	public int compareTo(Member2 member) {
		System.out.println("compare호출 확인용도");
		return (this.memberId - member.memberId);
	}
}
