package chapter14.collection.map.hashmap;

import chapter14.collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberSon = new Member(1001, "손흥민");
		Member memberKim = new Member(1002, "김민재");
		Member memberLee = new Member(1003, "이강인");
		Member memberHwa = new Member(1004, "황희찬");
		
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHwa);
		
		memberHashMap.showAllMember();
		
		Member memberLee2 = new Member(1003, "이강두");
		memberHashMap.addMember(memberLee2);
		
		memberHashMap.showAllMember();
	}

}
