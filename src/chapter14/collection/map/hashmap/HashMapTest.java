package chapter14.collection.map.hashmap;

import java.util.HashMap;

// Map 인터페이스를 구현한 HashMap클래스 예제.
// key와 value 쌍으로 된 구조를 갖고 있음. 이 구조를 Entry라고 부름.
public class HashMapTest {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("가", 1); // Set과 List는 데이터 저장할 때 add() 메서드 사용했는데 put 사용함.
		map.put("나", 2);
		map.put("다", 3);
		map.put("라", 4);
		map.put("마", 5);
		
		System.out.println(map.get("가")); // 1
		
	}

}
