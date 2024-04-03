package chapter14.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import chapter14.collection.Member2;

public class MemberTreeSet {
	
	private TreeSet<Member2> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member2>();
	}
	
	public void addMember(Member2 member) {
		// 메서드 동작하면서 Member2클래스의 compareTo() 메서드가 호출됨
		treeSet.add(member);
	}
	

	public boolean removeMember(int memberId) {
		Iterator<Member2> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member2 member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		} return false;
	}
	
	public void showAllMember() {
		for(Member2 member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	

}
