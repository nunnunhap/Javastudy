package chapter14.collection.linkedlist;

import java.util.LinkedList;

// 자료구조 : 링크드리스트 예제
public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList); //[A, B, C]
		myList.add(1, "D");
		myList.addFirst("E");
		myList.removeLast();
		
		System.out.println(myList); // [E, A, D, B]
		
	}

}
