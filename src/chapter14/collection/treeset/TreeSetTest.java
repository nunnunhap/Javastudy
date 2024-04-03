package chapter14.collection.treeset;

import java.util.TreeSet;

// Set 인터페이스를 구현한 TreeSet 클래스 예제
// 
public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		// 아래 데이터 추가 시 대소비교하여 이진분류로 좌, 우측으로 정렬배치하면서 데이터 저장
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		// 데이터가 정렬된 상태로 출력된 것을 확인할 수 있음.
		for(String str : treeSet) {
			System.out.println(str);
		}
		
		TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
		
		treeSet2.add(4);
		treeSet2.add(1);
		treeSet2.add(7);

		for(Integer num : treeSet2) {
			System.out.println(num);
		}

	}
}
