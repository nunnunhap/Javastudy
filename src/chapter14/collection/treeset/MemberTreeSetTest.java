package chapter14.collection.treeset;

import chapter14.collection.Member2;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		int memberStatic = 1000;
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		// 객체생성(데이터)
		// 아래의 객체가 TreeSet클래스 메모리에 저장될 때, 대소비교가 가능하게 할려면
		// Member2클래스가 Comparable 인터페이스 또는 Comparator 인터페이스를 구현해야 함.
		Member2 memberSon = new Member2(1001, "손흥민");
//		Member2 memberKim = new Member2(1002, "김민재");
//		Member2 memberLee = new Member2(1003, "이강인");
//		Member2 memberHwa = new Member2(1004, "황희찬");
		
		memberTreeSet.addMember(memberSon);
//		memberTreeSet.addMember(memberKim);
//		memberTreeSet.addMember(memberLee);
//		memberTreeSet.addMember(memberHwa);
		
		memberTreeSet.showAllMember();
		
		Member2 memberLee2 = new Member2(1003, "이강인");
		memberTreeSet.addMember(memberLee2);
		
		memberTreeSet.showAllMember();
	}

}
