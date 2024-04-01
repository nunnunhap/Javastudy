package chapter14.collection;

public class Member {
	private int memberId;
	private String memberName;
	
	
	// 매개변수 있는 생성자
	public Member(int memberId, String memberName) {
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
}
